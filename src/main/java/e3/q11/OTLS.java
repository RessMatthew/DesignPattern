package e3.q11;

import java.util.ArrayList;

/**
 * @Description
 * @Date 2023/1/3 16:31
 * @Author RessMatthew
 * @Version 1.0
 **/

public class OTLS {
    protected ArrayList<Observer> students = new ArrayList<Observer>();

    public void join(Observer obs){
        students.add(obs);
    }

    public void quit(Observer obs){
        students.remove(obs);
    }

    public void classNotifis(){
        System.out.println("直播课上课通知:");
        for(Observer observer:students){
            observer.getClassNotify();
        }
    }

    public void resourceNotifis(){
        System.out.println("学习资源发布通知:");
        for(Observer observer:students){
            observer.getResourceNotify();
        }
    }
}
