package e3.q6;

/**
 * @Description
 * @Date 2023/1/3 12:42
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Sensor sensor = new ThemoSensor();
        sensor.join(new CautionLightObserver());
        sensor.join(new AnnunciatorObserver());
        sensor.join(new SecurityDoorObserver());
        sensor.join(new InsulatedDoorObserver());
        sensor.notifys();
    }
}
