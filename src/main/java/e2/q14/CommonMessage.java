package e2.q14;

public class CommonMessage extends LevelMessage {

   @Override
   public void send(String content) {
      sm.sendMessage("发送CommonMessage:"+content);
   }

}