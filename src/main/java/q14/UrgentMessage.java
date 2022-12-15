package q14;

import java.util.*;


public class UrgentMessage extends LevelMessage {

   @Override
   public void send(String content) {
      sm.sendMessage("发送UrgentMessage:"+content);
   }

}