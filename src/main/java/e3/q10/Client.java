package e3.q10;

/**
 * @Description
 * @Date 2023/1/3 23:29
 * @Author RessMatthew
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        TestPaper testPaper = new TestPaper();
        testPaper.setAutomatic(new PSOAdapter());
        testPaper.generate();
    }
}
