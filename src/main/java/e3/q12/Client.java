package e3.q12;

/**
 * @Description
 * @Date 2023/1/3 23:18
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Login login = new Login();
        login.setMethod(new QQAdapter());
        login.login();
    }
}
