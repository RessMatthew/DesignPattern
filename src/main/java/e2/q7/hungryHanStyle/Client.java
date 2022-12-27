package e2.q7.hungryHanStyle;

/**
 * @Description
 * @Date 2022/12/15 14:22
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        VUGeneerator gen1,gen2;
        gen1 = VUGeneerator.getInstance();
        gen2 = VUGeneerator.getInstance();
        System.out.println(gen1==gen2);
    }
}
