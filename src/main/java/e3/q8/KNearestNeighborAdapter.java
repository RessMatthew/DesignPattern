package e3.q8;

/**
 * @Description
 * @Date 2023/1/3 13:51
 * @Author RessMatthew
 * @Version 1.0
 **/

public class KNearestNeighborAdapter extends DataClassify{
    protected KNearestNeighbor knn = new KNearestNeighbor();
    @Override
    public void call(){
        knn.KNNClassify();
    }
}
