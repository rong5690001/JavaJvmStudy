package org.fenixsoft.clazz;

import java.util.Enumeration;
import java.util.Vector;

public class ExtendTest {
    public final int i;

    public ExtendTest() {
        i = 0;
    }

    static abstract class A {

        public String a = "a";

        public abstract void draw();

        public A() {
            draw();
        }

        public void s() {
            System.out.println("it's a");
        }
    }

    static class B extends A {
        public String a = "b";
        private int r;

        public B(int r) {
            System.out.println("构建B");
            this.r = r;
        }

        @Override
        public void draw() {
            System.out.println("draw:" + r);
        }

        public void s() {
            System.out.println("it's b");
            class MethodInner {
                int b = 0;
            }

            MethodInner methodInner = new MethodInner();
            methodInner.b = 3;

        }
    }

    interface C {
        int a = 0;
    }

//    public A
//            a = new A(),
//            b = new A();

    public static void main(String[] args) {
//        for (int i = 0; i < 20; i++) {
//            System.out.println("i");
//            retry:
//            while (true) {
//                for (int j = 0; j < 20; j++) {
//                    System.out.println("j--");
//                    for (int k = 0; k < 20; k++) {
//                        continue retry;
//                    }
//                    break;
//                }
//            }
//        }
//
//        Vector vector = new Vector();
//        for (int i = 0; i < 200; i++) {
//            vector.addElement(i);
//        }
//
//        Enumeration enumeration = vector.elements();
//
//        new Thread(() -> {
//            while (enumeration.hasMoreElements()){
//                System.out.println("threadA:"+enumeration.nextElement());
//            }
//        }).start();
//
//        new Thread(() -> {
//            while (enumeration.hasMoreElements()){
//                System.out.println("threadB:"+enumeration.nextElement());
//            }
//        }).start();

        System.out.println("1 << 2:" + (51 ^ 3));
    }
}
