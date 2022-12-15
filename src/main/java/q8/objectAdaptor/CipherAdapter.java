package q8.objectAdaptor;

/**
 * @Description
 * @Date 2022/12/15 15:07
 * @Author RessMatthew
 * @Version 1.0
 **/

public class CipherAdapter extends DataOperator{
    Cipher cipher;
    CipherAdapter(){
        cipher = new Cipher();
    }
    @Override
    public String encrypt(int key, String password) {
        return cipher.encrypt(key,password);
    }
}
