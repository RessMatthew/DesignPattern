package e3.q3;

/**
 * @Description
 * @Date 2022/12/27 19:49
 * @Author RessMatthew
 * @Version 1.0
 **/

public abstract class Filter {
    protected Filter successor;

    public void setSuccessor(Filter filter){
        this.successor = filter;
    }

    public abstract void doFilter(String request);
}
