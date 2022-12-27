package e2.q3;

/**
 * @Description
 * @Date 2022/12/6 20:26
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Encryptor encryptor;
        String type = XMLUtil.getEncryptorType();
        encryptor = EncryptorFactory.getEncryptor(type);
        encryptor.thicken();
    }
}
