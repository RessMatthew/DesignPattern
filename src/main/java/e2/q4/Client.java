package e2.q4;

/**
 * @Description
 * @Date 2022/12/6 20:45
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        ImageReaderFactory factory;
        ImageReader imageReader;
        factory = (ImageReaderFactory)XMLUtil.getImagerReader();
        imageReader = factory.createImagerReader();
        imageReader.read();
    }
}
