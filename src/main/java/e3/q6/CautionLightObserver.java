package e3.q6;

/**
 * @Description
 * @Date 2023/1/3 12:39
 * @Author RessMatthew
 * @Version 1.0
 **/

public class CautionLightObserver extends CautionLight implements Observer {
    @Override
    public void alarm() {
        super.flicker();
    }
}
