package e3.q10;

/**
 * @Description
 * @Date 2023/1/3 23:25
 * @Author RessMatthew
 * @Version 1.0
 **/

public class TestPaper {
    private AutomaticTestPaper automatic;

    public void setAutomatic(AutomaticTestPaper automatic){
        this.automatic = automatic;
    }

    public void generate(){
        System.out.println("自动组卷：");
        this.automatic.generateTestPaper();
    }
}
