package e3.q4;

/**
 * @Description
 * @Date 2022/12/27 21:02
 * @Author RessMatthew
 * @Version 1.0
 **/

public class LightCommand2 extends Command{
    RoomLight2 light2 = new RoomLight2();

    @Override
    public void control(boolean state) {
        System.out.println("控制"+light2.getClass().getName()+"："+state);
        light2.switchState(state);
    }
}
