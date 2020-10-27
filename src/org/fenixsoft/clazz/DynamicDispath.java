package org.fenixsoft.clazz;

public class DynamicDispath {

    static abstract class Human {
        protected abstract void say();
    }

    static class Man extends Human {

        @Override
        protected void say() {
            System.out.println("Man");
        }
    }

    static class Women extends Human {

        @Override
        protected void say() {
            System.out.println("Women");
        }
    }

    public static void main(String[] args){
        Human man = new Man();
        Human women = new Women();
        man.say();
        women.say();
        man = new Women();
        man.say();
    }
}
