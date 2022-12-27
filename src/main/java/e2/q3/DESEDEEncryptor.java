package e2.q3;

/**
 * @Description
 * @Date 2022/12/6 20:17
 * @Author RessMatthew
 * @Version 1.0
 **/

public class DESEDEEncryptor implements Encryptor{
    public DESEDEEncryptor() {
        System.out.println("创建DESEDEEncryptor");
    }
    @Override
    public void thicken() {
        System.out.println("使用DESEDE加密");
    }
}
