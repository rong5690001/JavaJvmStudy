package demo;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private static String svalue;

    public static void main(String[] args) throws ParseException {
//        String s = "2018.07.07 23:59";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = new Date(s);
//        System.out.println(date.toGMTString());

//        Pattern p = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.com");
//        Matcher m = p.matcher("34Ax5284168@qq99AS.com");
//        float value = 124.6334f;
//        String strValue = String.valueOf(value);
////        System.out.println(strValue);
//        int dotLength = strValue.length() - strValue.indexOf(".") - 1;
////        System.out.println(Math.round(dotLength));
////        System.out.println(Math.round(value));
//
//        BigDecimal bigDecimal = new BigDecimal(value);
//        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
//        System.out.println(bigDecimal.floatValue());
//
//
//        svalue.equals("");
//        AtomicInteger atomicInteger = new AtomicInteger(0);
//        System.out.println(atomicInteger.incrementAndGet());
//        System.out.println(atomicInteger.intValue());

//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR, 2019);
//        calendar.set(Calendar.MONTH, -14);
//        calendar.set(Calendar.DAY_OF_MONTH, 27);
//        calendar.set(Calendar.HOUR_OF_DAY, 0);
//        calendar.set(Calendar.MINUTE, 0);
//        calendar.set(Calendar.SECOND, 0);
//        calendar.set(Calendar.MILLISECOND, 0);
//        calendar = new Calendar.Builder().setDate(2019, -4, 27).build();
//
//        System.out.println(calendar.getTime().getYear() + 1900);
//        System.out.println(calendar.getTime().getMonth());
//        System.out.println(calendar.getTime().getDay());
//        System.out.println(calendar.getTimeInMillis());
//        System.out.println(System.currentTimeMillis());

        BigDecimal number = new BigDecimal(1000.0000);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("money", number);
        TestBean testBean = new Gson().fromJson(jsonObject.toString(), TestBean.class);
        System.out.println(testBean.money);
    }


    public static class TestBean {
        public String money;
    }
}
