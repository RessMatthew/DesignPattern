package e2.q8.classAdaptor;

public interface DataOperator {
    public void setPassword(String password);
    public String getPassword();
    public abstract String encrypt(int key,String password);
}
