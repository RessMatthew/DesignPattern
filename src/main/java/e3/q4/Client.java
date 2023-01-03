package e3.q4;

/**
 * @Description
 * @Date 2022/12/27 21:05
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Switch _switch = new Switch();
        _switch.setCommand(0,new LightCommand1());
        _switch.setCommand(1,new LightCommand2());
        _switch.setCommand(2,new LightCommand3());
        _switch.setCommand(3,new LightCommand4());
        _switch.setCommand(4,new LightCommand5());
        boolean[] commands = {true,false,true,false,false};
        _switch.execute(commands);
    }
}
