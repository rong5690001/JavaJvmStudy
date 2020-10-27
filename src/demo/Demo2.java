package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo2 {

    public boolean aBoolean(int a) throws Exception{
        try {
            InputStream inputStream = new FileInputStream("");
            String b = String.valueOf(a);
        } catch (IOException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    public int inc() {
        int x;
        try {
            x = 10;
            return x;
        } catch (Exception e) {
            x = 20;
            return x;
        } finally {
            x = 30;
//            return x;
        }
    }


}

class StaticTest {
    public static void main(String[] args) {
        System.out.println(new Demo2().inc());
    }

    private static StaticTest st = new StaticTest();

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    StaticTest() {
        System.out.println("3");
        System.out.println("a=" + a + ",b=" + b);
    }

    public static void staticFunction() {
        System.out.println("4");
    }

    int a = 110;
    static int b = 112;
}