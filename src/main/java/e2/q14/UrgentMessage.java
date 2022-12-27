package e2.q14;


public class UrgentMessage extends LevelMessage {

   @Override
   public void send(String content) {
      sm.sendMessage("发送UrgentMessage:"+content);
   }

}