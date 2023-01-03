package e3.q8;

/**
 * @Description
 * @Date 2023/1/3 13:50
 * @Author RessMatthew
 * @Version 1.0
 **/

public class NaiveBayesAdapter extends DataClassify{
    protected NaiveBayes nb = new NaiveBayes();
    @Override
    public void call(){
        nb.NBClassify();
    }
}
