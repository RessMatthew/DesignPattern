package e3.q4;

/**
 * @Description
 * @Date 2022/12/27 20:48
 * @Author RessMatthew
 * @Version 1.0
 **/

public class LightCommand1 extends Command{
    RoomLight1 light1 = new RoomLight1();

    @Override
    public void control(boolean state) {
        System.out.println("控制"+light1.getClass().getName()+"："+state);
        light1.switchState(state);
    }
}
