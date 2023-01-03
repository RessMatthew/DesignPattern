package e3.q5;

/**
 * @Description
 * @Date 2023/1/3 10:54
 * @Author RessMatthew
 * @Version 1.0
 **/

public class NumberCounter implements Observer {
    @Override
    public void update() {
        System.out.println("显示可编辑文本区中出现的单词总数量和字符总数量");
    }
}
