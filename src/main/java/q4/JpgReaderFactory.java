package q4;

/**
 * @Description
 * @Date 2022/12/6 20:42
 * @Author RessMatthew
 * @Version 1.0
 **/

public class JpgReaderFactory implements ImageReaderFactory{
    @Override
    public ImageReader createImagerReader() {
        return new JpgReader();
    }
}
