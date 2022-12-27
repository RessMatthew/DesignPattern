package e2.q14;


public class ShortMessage implements SendMethod {

   @Override
   public void sendMessage(String content) {
      System.out.println("使用短信发送"+content);
   }

}