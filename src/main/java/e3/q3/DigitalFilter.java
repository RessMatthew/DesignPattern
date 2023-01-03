package e3.q3;

/**
 * @Description
 * @Date 2022/12/27 19:55
 * @Author RessMatthew
 * @Version 1.0
 **/

public class DigitalFilter extends Filter{
    @Override
    public void doFilter(String request) {
        if("Digital".equals(request)){
            System.out.println("由数据过滤器过滤");
        }
        else {
            System.out.println("数据过滤器过滤不能处理，转交successor");
            this.successor.doFilter(request);
        }
    }
}
