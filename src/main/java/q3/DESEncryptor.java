package q3;

/**
 * @Description
 * @Date 2022/12/6 20:09
 * @Author RessMatthew
 * @Version 1.0
 **/

public class DESEncryptor implements Encryptor{
    public DESEncryptor() {
        System.out.println("创建DESEncryptor");
    }
    @Override
    public void thicken() {
        System.out.println("使用DES加密");
    }
}
