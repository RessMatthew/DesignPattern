package e3.q6;

/**
 * @Description
 * @Date 2023/1/3 12:42
 * @Author RessMatthew
 * @Version 1.0
 **/

public class InsulatedDoorObserver extends InsulatedDoor implements Observer{
    @Override
    public void alarm() {
        super.close();
    }
}
