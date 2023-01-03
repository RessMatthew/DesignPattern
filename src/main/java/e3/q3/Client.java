package e3.q3;

/**
 * @Description
 * @Date 2022/12/27 19:59
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        ChartFilter chartFilter = new ChartFilter();
        DigitalFilter digitalFilter = new DigitalFilter();
        ValidateFilter validateFilter = new ValidateFilter();
        chartFilter.setSuccessor(digitalFilter);
        digitalFilter.setSuccessor(validateFilter);

        chartFilter.doFilter("Validate");

    }
}
