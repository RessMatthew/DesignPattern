package q7.hungryHanStyle;


import java.util.List;

/**
 * @Description
 * @Date 2022/12/15 14:20
 * @Author RessMatthew
 * @Version 1.0
 **/

public class VUGeneerator {
    private static final VUGeneerator instance = new VUGeneerator();
    private VUGeneerator(){}
    public static VUGeneerator getInstance(){
        return instance;
    }
    public List generateVirtualUsers(){
        return null;
    }
}
