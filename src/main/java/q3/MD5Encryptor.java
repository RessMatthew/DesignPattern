package q3;

/**
 * @Description
 * @Date 2022/12/6 20:11
 * @Author RessMatthew
 * @Version 1.0
 **/

public class MD5Encryptor implements Encryptor{
    public MD5Encryptor() {
        System.out.println("创建MD5Encryptor");
    }
    @Override
    public void thicken() {
        System.out.println("使用MD5加密");
    }
}
