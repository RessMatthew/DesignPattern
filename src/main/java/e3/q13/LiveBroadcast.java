package e3.q13;

import e2.q7.doubleDetectionLock.VUGenerator;

/**
 * @Description
 * @Date 2023/1/3 22:56
 * @Author RessMatthew
 * @Version 1.0
 **/

public class LiveBroadcast {
    private volatile static LiveBroadcast instance;
    private Camera camera;
    private Microphone microphone;
    private ScreenRecorder screenRecorder;

    LiveBroadcast(){
        instance = null;
        this.camera = new Camera();
        this.microphone = new Microphone();
        this.screenRecorder = new ScreenRecorder();
    }

    public static LiveBroadcast getInstance(){
        if(instance==null){
            synchronized (VUGenerator.class){
                if(instance==null){
                    instance = new LiveBroadcast();
                }
            }
        }
        return instance;
    }

    public void openAll(){
        System.out.println("一键开启：");
        this.camera.open();
        this.microphone.open();
        this.screenRecorder.open();
    }

    public void closeAll(){
        System.out.println("一键关闭：");
        this.camera.close();
        this.microphone.close();
        this.screenRecorder.close();
    }

}
