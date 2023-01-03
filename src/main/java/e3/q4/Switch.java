package e3.q4;

/**
 * @Description
 * @Date 2022/12/27 20:39
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Switch {
    public Command[] commands = new Command[5];

    public void setCommand(int index,Command command) {
        this.commands[index] = command;
    }

    public void execute(boolean[] commands){
        for(int i=0;i<this.commands.length;i++){
            this.commands[i].control(commands[i]);
        }
    }
}
