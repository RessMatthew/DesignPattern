package e2.q7.doubleDetectionLock;

import java.util.List;

/**
 * @Description
 * @Date 2022/12/15 14:29
 * @Author RessMatthew
 * @Version 1.0
 **/

public class VUGenerator {
    private volatile static VUGenerator instance =null;
    private VUGenerator(){}
    public static VUGenerator getInstance(){
        if(instance==null){
            synchronized (VUGenerator.class){
                if(instance==null){
                    instance = new VUGenerator();
                }
            }
        }
        return instance;
    }
    public List generateVitualUsers(){
        return null;
    }
}
