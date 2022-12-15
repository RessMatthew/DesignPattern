package q14;

import java.util.*;


public class EmergencyMessage extends LevelMessage {

   @Override
   public void send(String content) {
      sm.sendMessage("发送EmergencyMessage:"+content);
   }

}