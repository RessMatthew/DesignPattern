package q14;

public class EmailAdapter extends EmailHandler implements SendMethod {

   @Override
   public void sendMessage(String content) {
      super.sendEmail(content);
   }

}