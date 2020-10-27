package demo;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
//        SuperClass[] superClasses = new SuperClass[3];
//        System.out.println(SubClass.value);
//        System.out.println(test("13501168401@163.com"));
//        System.out.println("请输入邮箱:");
//        Scanner sc = new Scanner(System.in);
//        String email = sc.next();
//        if (emailFormat(email)) {
//            System.out.println("√");
//            return;
//        } else {
//            System.out.println("您的邮箱格式不正确,请重新输入!");
//            main(args);
//        }
//        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
//        System.out.println("uuid:" + uuid);
//        int a = 0;
//        System.out.println(String.format(Locale.CHINA
//                , "促销价不能低于标价(¥%s)的70%%", "20,00"));
        System.out.println(Math.round(2.5));
    }

    public static class JsonTest {
        public String a;
        public String b;
    }

    public static boolean test(String strEmail) {
//        String strPattern = "\"^[a-zA-Z0-9]+@[a-zA-Z0-9]+.com\"";
//        String strPattern = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String strPattern = "^([a-z0-9A-Z]+[-|\\\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\\\.)+[a-zA-Z]{2,}$";
        Pattern p = Pattern.compile(strPattern);
        Matcher m = p.matcher(strEmail);
        return m.matches();
    }

    /**
     * 验证输入的邮箱格式是否符合
     *
     * @param email
     * @return 是否合法
     */
    public static boolean emailFormat(String email) {
        final String pattern1 = "^([a-z0-9A-Z]+[-|//.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?//.)+[a-zA-Z]{2,}$";
        final Pattern pattern = Pattern.compile(pattern1);
        final Matcher mat = pattern.matcher(email);
        return mat.matches();
    }
}

class SSClass {
    static {
        System.out.println("SSClass");
    }
}

class SuperClass extends SSClass {
    static {
        System.out.println("SuperClass init!");
    }

    public static final int value = 123;

    public SuperClass() {
        System.out.println("init SuperClass");
    }
}

class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init");
    }

    static final int a = -1;

    public SubClass() {
        System.out.println("init SubClass");
    }

    public class InnerClass {

    }
}
