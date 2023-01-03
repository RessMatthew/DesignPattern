package e3.q2;

/**
 * @Description
 * @Date 2022/12/27 19:33
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Picture implements Application{
    private RealApplication realApplication;

    public Picture(){
        realApplication = new RealApplication();
    }

    @Override
    public void run() {
        System.out.println("调用Picture的run");
        realApplication.run();
    }
}
