package e3.q6;

/**
 * @Description
 * @Date 2023/1/3 12:41
 * @Author RessMatthew
 * @Version 1.0
 **/

public class SecurityDoorObserver extends SecurityDoor implements Observer{
    @Override
    public void alarm() {
        super.open();
    }
}
