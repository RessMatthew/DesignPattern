package e3.q11;

/**
 * @Description
 * @Date 2023/1/3 16:33
 * @Author RessMatthew
 * @Version 1.0
 **/

public class StudentB implements Observer{
    @Override
    public void getClassNotify() {
        System.out.println("学生B获得直播课上课通知");
    }

    @Override
    public void getResourceNotify() {
        System.out.println("学生B获得直播课上课通知");
    }
}
