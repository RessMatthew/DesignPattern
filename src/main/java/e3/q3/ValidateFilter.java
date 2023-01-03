package e3.q3;

/**
 * @Description
 * @Date 2022/12/27 19:58
 * @Author RessMatthew
 * @Version 1.0
 **/

public class ValidateFilter extends Filter{
    @Override
    public void doFilter(String request) {
        if("Validate".equals(request)){
            System.out.println("由数据校验过滤器过滤");
        }
    }
}
