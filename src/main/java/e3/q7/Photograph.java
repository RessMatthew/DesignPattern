package e3.q7;

/**
 * @Description
 * @Date 2023/1/3 13:25
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Photograph {
    protected Filter filter;

    public void setFilter(Filter filter){
        this.filter = filter;
    }

    public void doBeautify(){
        System.out.println("进行美化");
        this.filter.beautify();
    }
}
