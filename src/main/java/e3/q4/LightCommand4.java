package e3.q4;

/**
 * @Description
 * @Date 2022/12/27 21:03
 * @Author RessMatthew
 * @Version 1.0
 **/

public class LightCommand4 extends Command{

    RoomLight4 light4 = new RoomLight4();
    @Override
    public void control(boolean state) {
        System.out.println("控制"+light4.getClass().getName()+"："+state);
        light4.switchState(state);
    }
}
