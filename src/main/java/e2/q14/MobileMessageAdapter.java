package e2.q14;

/**
 * @Description
 * @Date 2022/12/16 1:19
 * @Author RessMatthew
 * @Version 1.0
 **/

public class MobileMessageAdapter extends MobileMessageHandler implements SendMethod{
    @Override
    public void sendMessage(String content) {
        System.out.println(content);
    }
}
