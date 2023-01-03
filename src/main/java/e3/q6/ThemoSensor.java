package e3.q6;

/**
 * @Description
 * @Date 2023/1/3 12:35
 * @Author RessMatthew
 * @Version 1.0
 **/

public class ThemoSensor extends Sensor{
    @Override
    public void notifys() {
        for(Observer observer:observers){
            observer.alarm();
        }
    }
}
