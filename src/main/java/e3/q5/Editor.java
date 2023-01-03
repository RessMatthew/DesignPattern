package e3.q5;

import java.util.ArrayList;

/**
 * @Description
 * @Date 2023/1/3 10:50
 * @Author RessMatthew
 * @Version 1.0
 **/

public abstract class Editor {
    protected ArrayList<Observer> counters = new ArrayList<Observer>();

    public void join(Observer obs){
        counters.add(obs);
    }

    public void quit(Observer obs){
        counters.remove(obs);
    }

    public abstract void notifys();
}
