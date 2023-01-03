package e3.q9;

/**
 * @Description
 * @Date 2023/1/3 23:37
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Examinee extends Observer{
    private String name;

    Examinee(String name){
        this.name = name;
    }

    @Override
    public void add(Observer obs) {
        System.out.println("不支持该方法");
    }

    @Override
    public void update() {
        System.out.println("考生"+name+"收到更新消息");
    }
}
