package e3.q7;

/**
 * @Description
 * @Date 2023/1/3 13:29
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Photograph photograph = new Photograph();
        photograph.setFilter(new BlackWhiteFilter());
        photograph.doBeautify();
    }
}
