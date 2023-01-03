package e3.q8;

/**
 * @Description
 * @Date 2023/1/3 13:50
 * @Author RessMatthew
 * @Version 1.0
 **/

public class DecisionTreeAdapter extends DataClassify{
    protected DecisionTree dt = new DecisionTree();
    @Override
    public void call(){
        dt.DTClassify();
    }
}
