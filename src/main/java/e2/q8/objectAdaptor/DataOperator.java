package e2.q8.objectAdaptor;

/**
 * @Description
 * @Date 2022/12/15 15:04
 * @Author RessMatthew
 * @Version 1.0
 **/

public abstract class DataOperator {
    public String password;
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public abstract String encrypt(int key,String password);
}
