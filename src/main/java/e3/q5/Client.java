package e3.q5;

/**
 * @Description
 * @Date 2023/1/3 11:01
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Editor editor = new TextArea();
        Observer numberCounter = new NumberCounter();
        Observer wordCounter = new WordCounter();
        Observer detailCounter = new DetailsCounter();
        editor.join(numberCounter);
        editor.join(wordCounter);
        editor.join(detailCounter);
        editor.notifys();
    }
}
