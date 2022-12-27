package e2.q6.shallowClone;

/**
 * @Description
 * @Date 2022/12/15 21:36
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Customer customer_previous = new Customer(); //创建原型对象
        Address address = new Address(); //创建地址对象
        customer_previous.setAddress(address);
        Customer customer_new = customer_previous.clone();
        System.out.println("顾客是否相同?"+(customer_new==customer_previous));
        System.out.println("地址是否相同?"+(customer_new.geAddress()==customer_previous.geAddress()));
    }
}
