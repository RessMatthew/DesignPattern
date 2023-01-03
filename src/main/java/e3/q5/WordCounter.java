package e3.q5;

/**
 * @Description
 * @Date 2023/1/3 10:55
 * @Author RessMatthew
 * @Version 1.0
 **/

public class WordCounter implements Observer{
    @Override
    public void update() {
        System.out.println("显示可编辑文本区中所出现的单词（去重后按照字典序排序）");
    }
}
