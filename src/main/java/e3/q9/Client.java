package e3.q9;

/**
 * @Description
 * @Date 2023/1/3 23:55
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Observer obs1 = new Group("分组1");
        Observer obs2 = new Group("分组2");
        Observer obs3  = new Examinee("考生A");
        Observer obs4  = new Examinee("考生B");
        Observer obs5  = new Examinee("考生C");
        obs1.add(obs3);
        obs2.add(obs4);
        obs2.add(obs5);
        obs1.add(obs2);
        Examination examinee = new Examination();
        examinee.join(obs1);
        examinee.update();
    }
}
