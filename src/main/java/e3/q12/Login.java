package e3.q12;

/**
 * @Description
 * @Date 2023/1/3 23:10
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Login {
    private LoginMethod method;

    public void  setMethod(LoginMethod method){
        this.method = method;
    }

    public void login(){
        System.out.println("登入：");
        method.validate();
    }
}
