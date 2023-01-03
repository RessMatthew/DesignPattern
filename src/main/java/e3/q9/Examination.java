package e3.q9;

import java.util.ArrayList;

/**
 * @Description
 * @Date 2023/1/3 23:36
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Examination {
    private ArrayList<Observer> candidatesList = new ArrayList<>();

    public void join(Observer obs){
        candidatesList.add(obs);
    }

    public void quit(Observer obs){
        candidatesList.remove(obs);
    }

    public void update(){
        for(Observer obs:candidatesList){
            obs.update();
        }
    }
}
