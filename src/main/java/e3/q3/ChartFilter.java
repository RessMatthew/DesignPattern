package e3.q3;

/**
 * @Description
 * @Date 2022/12/27 19:52
 * @Author RessMatthew
 * @Version 1.0
 **/

public class ChartFilter extends Filter{
    @Override
    public void doFilter(String request) {
        if("Chart".equals(request)){
            System.out.println("由字符过滤器过滤");
        }
        else {
            System.out.println("字符过滤器过滤不能处理，转交successor");
            this.successor.doFilter(request);
        }
    }
}
