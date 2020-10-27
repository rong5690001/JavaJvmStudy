package org.fenixsoft.clazz;

import com.google.gson.*;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeTest {

    private static int a = 1;
    ReentrantLock reentrantLock = new ReentrantLock();
    static boolean a3;

    public void sum() {
        synchronized (this) {

//        reentrantLock.lock();
            try {
                a++;
//                System.out.println("a++");
                System.out.println("start");
                Thread.sleep(1000);
//                a++;
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("end");
//        reentrantLock.unlock();
        }
        System.out.println("fdsafdsafds");
    }

    public static void main(String[] args) throws Exception {
        ThreadSafeTest threadSafeTest = new ThreadSafeTest();
        for (int i = 0; i < 3; i++) {
            new Thread(() -> threadSafeTest.sum()).start();
        }
//
//        System.out.println("最终结果："+a);
//        String value = "\"{\\\"shareParam\\\":{\\\"url\\\":\\\"http://jzwap.uat1.rs.com/b/articleDetail.html?detailId=89\\\",\\\"title\\\":\\\"88㎡美式文艺家，女主人的文艺气质\\\",\\\"desc\\\":\\\"为设计师链接新未来，星设计——设计师的成长成名交流社区\\\",\\\"imgUrl\\\":\\\"http://img1.uat1.rs.com/g1/M00/03/17/wKh8y1pcIEyAXGzHAAOsRN50oug738.jpg\\\",\\\"type\\\":3},\\\"scrollType\\\":\\\"transparency\\\",\\\"isLike\\\":false,\\\"openId\\\":\\\"\\\",\\\"add\\\":-1,\\\"isAtten\\\":false}\"";
//        Gson gson = new Gson();
//        JsonPrimitive jsonPrimitive = new JsonPrimitive(value);
//        String value2 = jsonPrimitive.getAsString();
//        System.out.println(value);
//        System.out.println(new String(value.getBytes("UTF-8")));
//        gson.fromJson(value2, JsonObject.class);
//        JsonObject jsonObject = new JsonObject();
//        jsonObject.add("data", jsonPrimitive);
//        System.out.println(jsonObject.toString());
//        run();
//        int[] a1 = {1,2,3,4,};
//        int[] a2;
//        a2 = a1;
//
//        for (int i = 0; i < a1.length; i++) {
//            a2[i]++;
//        }
//        for (int i = 0; i < a1.length; i++) {
//            System.out.println("a1["+i+"]:" + a1[i]);
//        }
//        System.out.println("a3:"+a3);
    }

    private static final OkHttpClient client = new OkHttpClient();

    public static void run() throws Exception {
        Request request = new Request.Builder()
                .url("https://api.github.com/repos/square/okhttp/issues")
                .header("User-Agent", "OkHttp Headers.java")
                .addHeader("Accept", "application/json; q=0.5")
                .addHeader("Accept", "application/vnd.github.v3+json")
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

        System.out.println("Server: " + response.header("Server"));
        System.out.println("Date: " + response.header("Date"));
        System.out.println("Vary: " + response.headers("Vary"));
    }


}
