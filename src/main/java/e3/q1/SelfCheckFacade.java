package e3.q1;

/**
 * @Description
 * @Date 2022/12/26 18:02
 * @Author RessMatthew
 * @Version 1.0
 **/

public class SelfCheckFacade {
    private EngineCheck engineCheck;
    private BrakeCheck brakeCheck;
    private LightingCheck lightingCheck;
    private TyreCheck tyreCheck;

    public SelfCheckFacade(){
        engineCheck = new EngineCheck();
        brakeCheck = new BrakeCheck();
        lightingCheck = new LightingCheck();
        tyreCheck = new TyreCheck();
    }

    public void selfCheck(){
        System.out.println("下面进行一键自检");
        engineCheck.checkEngine();
        brakeCheck.checkBrake();
        lightingCheck.checkLighting();
        tyreCheck.checkTyre();
    }
}
