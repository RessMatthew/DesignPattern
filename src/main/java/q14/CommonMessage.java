package q14;

import java.util.*;

public class CommonMessage extends LevelMessage {

   @Override
   public void send(String content) {
      sm.sendMessage("发送CommonMessage:"+content);
   }

}