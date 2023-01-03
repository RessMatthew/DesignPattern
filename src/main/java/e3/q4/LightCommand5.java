package e3.q4;

/**
 * @Description
 * @Date 2022/12/27 21:04
 * @Author RessMatthew
 * @Version 1.0
 **/

public class LightCommand5 extends Command{
    RoomLight5 light5 = new RoomLight5();
    @Override
    public void control(boolean state) {
        System.out.println("控制"+light5.getClass().getName()+"："+state);
        light5.switchState(state);
    }
}
