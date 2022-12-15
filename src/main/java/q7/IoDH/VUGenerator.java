package q7.IoDH;

import java.util.List;

/**
 * @Description
 * @Date 2022/12/15 14:38
 * @Author RessMatthew
 * @Version 1.0
 **/

public class VUGenerator {
    private VUGenerator() { }

    //静态内部类
    private static class HolderClass {
        private final static VUGenerator instance = new VUGenerator();
    }

    public static VUGenerator getInstance() {
        return HolderClass.instance;
    }
    public List generateVirtualUsers() {
        return null;
    }
}
