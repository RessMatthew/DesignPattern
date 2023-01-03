package e3.q12;

/**
 * @Description
 * @Date 2023/1/3 23:14
 * @Author RessMatthew
 * @Version 1.0
 **/

public class AccountLogin implements LoginMethod{
    @Override
    public void validate() {
        System.out.println("使用账号密码登录");
    }
}
