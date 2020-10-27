package org.fenixsoft.clazz;

public class ThreadStatusTest {

    static volatile boolean isAOk = false;
    static Thread blinker;

    public static void main(String[] args) {
        Thread b = new Thread(() -> {
            System.out.println("b started");
            try {
                Thread.sleep(1000);
                while (true) {
                    System.out.println("b b b b b resumed");
                    while (isAOk) {
                        isAOk = false;
                        stop(Thread.currentThread());
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        });
        b.start();
        System.out.println(b.getName());

        Thread a = new Thread(() -> {
            try {
                System.out.println("a started");
                Thread.sleep(1000);
                isAOk = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                isAOk = true;
            }
        });

        a.start();

    }

    public static synchronized void stop(Thread thread){
        System.out.println(thread.getName());
        blinker = thread;
        thread = null;
        blinker.notify();
    }

}
