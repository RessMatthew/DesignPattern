package q8.classAdaptor;

/**
 * @Description
 * @Date 2022/12/15 16:12
 * @Author RessMatthew
 * @Version 1.0
 **/

public class CipherAdapter extends Cipher implements DataOperator {

    public String password;

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String encrypt(int key, String password) {
        return super.encrypt(key,password);
    }

}
