package e2.q4;

/**
 * @Description
 * @Date 2022/12/6 20:39
 * @Author RessMatthew
 * @Version 1.0
 **/

public class GifReaderFactory implements ImageReaderFactory{

    @Override
    public ImageReader createImagerReader() {
        return new GifReader();
    }
}
