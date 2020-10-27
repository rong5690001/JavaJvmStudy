package org.fenixsoft.clazz;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {

    public interface IHello {
        void sayhello();
    }

    public static class Hello implements IHello {

        @Override
        public void sayhello() {
            System.out.println("hello");
        }
    }

    public static class DynamicProxy implements InvocationHandler {

        Object originalObj;

        Object bind(Object originalObj) {
            this.originalObj = originalObj;
            return Proxy.newProxyInstance(originalObj.getClass().getClassLoader()
                    , originalObj.getClass().getInterfaces()
                    , this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("welcome");
            return method.invoke(originalObj, args);
        }
    }

    public static void main(String[] args) {
        IHello iHello = (IHello) (new DynamicProxy().bind(new Hello()));
        iHello.sayhello();
        System.out.println("pm.getName:" +iHello.getClass().getName());
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        if(true){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
