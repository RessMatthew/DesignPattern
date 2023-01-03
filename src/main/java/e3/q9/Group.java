package e3.q9;

import e2.q10.AbstractGroup;

import java.util.ArrayList;

/**
 * @Description
 * @Date 2023/1/3 23:37
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Group extends Observer{
    private String name;
    private ArrayList<Observer> examineeList = new ArrayList<>();

    Group(String name){
        this.name = name;
    }

    @Override
    public void add(Observer obs){
        examineeList.add(obs);
    }

    public void remove(Observer obs){
        examineeList.remove(obs);
    }

    @Override
    public void update() {
        System.out.println("发送给"+name+"分组全部考生");
        for(Observer obs:examineeList){
            obs.update();
        }
    }
}
