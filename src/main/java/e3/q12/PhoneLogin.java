package e3.q12;

/**
 * @Description
 * @Date 2023/1/3 23:13
 * @Author RessMatthew
 * @Version 1.0
 **/

public class PhoneLogin implements LoginMethod{
    @Override
    public void validate() {
        System.out.println("使用手机验证码登录");
    }
}
