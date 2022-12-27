package e2.q9;

/**
 * @Description
 * @Date 2022/12/15 17:26
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Filter filter = new Cutout();
        Image image = new BMPImage();
        image.setImageFilter(filter);
        image.parseFile("杨过");
    }
}
