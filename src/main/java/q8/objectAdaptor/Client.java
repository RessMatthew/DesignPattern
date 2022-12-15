package q8.objectAdaptor;

/**
 * @Description
 * @Date 2022/12/15 15:11
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        DataOperator dataOperator;
        dataOperator = new CipherAdapter();
        System.out.println(dataOperator.encrypt(1,"123"));
    }
}
