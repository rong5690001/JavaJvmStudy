package demo;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOTest<T> {

    private T t;


    public static void main(String[] args) throws IOException {

//        while (true) {
//            byte[] bytes = new byte[1024];
//            InputStream inputStream = new FileInputStream(new File("/Users/user/Documents/星设计安卓端-著作权申请代码.docx"));
//
//            int offset = 0;
//            int length = 1024;
//            inputStream.read(bytes, offset, bytes.length);
//
//            System.out.println("读完了");
//
//            inputStream.close();
//        }


        while (true) {
            RandomAccessFile accessFile = new RandomAccessFile("/Users/user/Documents/星设计安卓端-著作权申请代码.docx", "rw");
            FileChannel fileChannel = accessFile.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            fileChannel.read(buffer);
            accessFile.close();
            System.out.println("读写了");

            int _int = 2;
            long _long = _int;

            long _long2 = 2L;
            int _int2 = (int) _long2;
        }

    }


}
