package q3;

/**
 * @Description
 * @Date 2022/12/6 20:13
 * @Author RessMatthew
 * @Version 1.0
 **/

public class EncryptorFactory {
    public static Encryptor getEncryptor(String type){
        Encryptor encryptor = null;
        if(type.equalsIgnoreCase("des")){
            encryptor = new DESEncryptor();
            System.out.println("初始化设置DESEncryptor");
        }else if(type.equalsIgnoreCase("desede")){
            encryptor = new DESEDEEncryptor();
            System.out.println("初始化设置DESEDEEncryptor");
        }else if(type.equalsIgnoreCase("md5")){
            encryptor = new MD5Encryptor();
            System.out.println("初始化设置MD5Encryptor");
        }
        return encryptor;
    }
}
