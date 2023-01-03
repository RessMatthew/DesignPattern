package e3.q12;

/**
 * @Description
 * @Date 2023/1/3 23:18
 * @Author RessMatthew
 * @Version 1.0
 **/

public class WeChatAdapter extends WeChatServer implements LoginMethod{
    @Override
    public void validate() {
        super.weChatLogin();
    }
}
