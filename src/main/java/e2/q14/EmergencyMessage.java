package e2.q14;


public class EmergencyMessage extends LevelMessage {

   @Override
   public void send(String content) {
      sm.sendMessage("发送EmergencyMessage:"+content);
   }

}