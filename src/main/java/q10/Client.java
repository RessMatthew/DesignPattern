package q10;

/**
 * @Description
 * @Date 2022/12/15 20:33
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        AbstractGroup g1  = new Group("分组A");
        AbstractGroup g2  = new Group("分组B");
        AbstractGroup m1  = new Member("用户1");
        AbstractGroup m2  = new Member("用户2");
        AbstractGroup m3  = new Member("用户3");
        g1.add(m1);
        g2.add(m2);
        g2.add(m3);
        g1.add(g2);
        g1.share();
    }
}
