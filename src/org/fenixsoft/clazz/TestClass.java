package org.fenixsoft.clazz;

public class TestClass {
    private int m;

    public int inc() {
        return m + 1;
    }

    public void say(Interface0 a){
        System.out.println("interface0");
    }
    public void say(People a){
//        /Users/user/IdeaProjects/JavaJvmStudy
        System.out.println("People");

    }

    public static void main(String[] args) {
//        Interface0 a = new People();
//        new TestClass().say(a);
        Interface0 a= new People();
        a.say();
        a = new People1();
        a.say();
    }
}

abstract class Interface0 {
    int a = 0;
    abstract void say();
}
//
//interface Interface1 extends Interface0 {
//    int a = 1;
//}

//interface Interface2 extends Interface1 {
//    int a = 2;
//}

class People extends Interface0 {
    public static int a = 3;
    @Override
    public void say(){
        System.out.println("people say");
    }
}

class People1 extends People {
    public static int a = 4;
    @Override
    public void say(){
        System.out.println("people1 say");
    }
}

