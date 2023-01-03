package e3.q8;

/**
 * @Description
 * @Date 2023/1/3 13:51
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        DataClassify dataClassify = new DecisionTreeAdapter();
        dataClassify.read();
        dataClassify.convert();
        dataClassify.call();
        dataClassify.display();

    }
}
