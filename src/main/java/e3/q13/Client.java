package e3.q13;

import e2.q7.hungryHanStyle.VUGeneerator;

/**
 * @Description
 * @Date 2023/1/3 23:02
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        LiveBroadcast broadcast1,broadcast2;
        broadcast1 = LiveBroadcast.getInstance();
        broadcast2 = LiveBroadcast.getInstance();
        System.out.println("是否是单例：");
        System.out.println(broadcast1==broadcast2);
        broadcast2.openAll();
        broadcast2.closeAll();
    }
}
