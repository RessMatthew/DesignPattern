package e3.q11;

/**
 * @Description
 * @Date 2023/1/3 16:36
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        OTLS otls = new OTLS();
        otls.join(new StudentA());
        otls.join(new StudentB());
        otls.classNotifis();
        otls.resourceNotifis();
    }
}
