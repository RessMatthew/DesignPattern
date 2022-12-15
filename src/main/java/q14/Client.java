package q14;

/**
 * @Description
 * @Date 2022/12/16 1:10
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        SendMethod sm = (SendMethod)XMLUtil.getSendMethod();
        LevelMessage lm = (LevelMessage)XMLUtil.getLevelMessage();
        lm.setSendMethod(sm);
        lm.send("test");
    }
}
