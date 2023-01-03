package e3.q11;

/**
 * @Description
 * @Date 2023/1/3 16:32
 * @Author RessMatthew
 * @Version 1.0
 **/

public class StudentA implements Observer{
    @Override
    public void getClassNotify() {
        System.out.println("学生A获得直播课上课通知");
    }

    @Override
    public void getResourceNotify() {
        System.out.println("学生A获得学习资源发布通知");
    }
}
