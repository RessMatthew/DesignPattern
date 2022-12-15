package q7.IoDH;

import q7.IoDH.VUGenerator;

/**
 * @Description
 * @Date 2022/12/15 14:22
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        VUGenerator gen1,gen2;
        gen1 = VUGenerator.getInstance();
        gen2 = VUGenerator.getInstance();
        System.out.println(gen1==gen2);
    }
}
