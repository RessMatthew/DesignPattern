package e3.q8;

/**
 * @Description
 * @Date 2023/1/3 13:46
 * @Author RessMatthew
 * @Version 1.0
 **/

public abstract class DataClassify {
    public void read(){
        System.out.println("读取数据");
    }

    public void convert(){
        System.out.println("转换数据格式");
    }

    public abstract void call();

    public void display(){
        System.out.println("显示数据分类结果");
    }
}
