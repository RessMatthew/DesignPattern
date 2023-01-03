package e3.q4;

/**
 * @Description
 * @Date 2022/12/27 21:02
 * @Author RessMatthew
 * @Version 1.0
 **/

public class LightCommand3 extends Command{
    RoomLight3 light3 = new RoomLight3();
    @Override
    public void control(boolean state) {
        System.out.println("控制"+light3.getClass().getName()+"："+state);
        light3.switchState(state);
    }
}
