package e3.q5;

/**
 * @Description
 * @Date 2023/1/3 10:57
 * @Author RessMatthew
 * @Version 1.0
 **/

public class TextArea extends Editor{

    @Override
    public void notifys() {
        for(Observer obs:counters){
            obs.update();
        }
    }
}
