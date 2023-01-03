package e3.q6;

import java.util.ArrayList;

/**
 * @Description
 * @Date 2023/1/3 12:32
 * @Author RessMatthew
 * @Version 1.0
 **/

public abstract class Sensor {
    protected ArrayList<Observer> observers = new ArrayList<Observer>();

    public void join(Observer obs){
        observers.add(obs);
    }
    public void quit(Observer obs){
        observers.remove(obs);
    }

    public abstract void  notifys();
}
