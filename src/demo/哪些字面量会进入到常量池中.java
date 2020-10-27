package demo;

public class 哪些字面量会进入到常量池中 {

    public class FinalTest{

        private int int_num =12;
        private final char char_num = 'a';
        private final short short_num =30;
        private final float float_num = 45.3f;
        private final double double_num =39.8;
        private final byte byte_num =121;
        private final long long_num = 2323L;
        private final boolean boolean_flage = true;

        private FinalTest instant = new FinalTest();

        public float anInt(int a, float b){
            return a + b;
        }

    }

    public static class InnerStatic {

    }

    public class Inner {

    }

//    public class Test{
//
//        private int int_num =12;
//        private char char_num = 'a';
//        private short short_num =30;
//        private float float_num = 45.3f;
//        private double double_num =39.8;
//        private byte byte_num =121;
//        private long long_num = 2323L;
//        private long long_delay_num ;
//        private boolean boolean_flage = true;
//        private String string_num = "string_num_value";
//
//        public void init(){
//            this.long_delay_num = 5555L;
//        }
//    }

}
