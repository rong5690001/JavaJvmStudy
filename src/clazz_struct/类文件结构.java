package clazz_struct;

public class 类文件结构<T> {

    private T t;

    private int intF;

    public int codeTest() {
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
