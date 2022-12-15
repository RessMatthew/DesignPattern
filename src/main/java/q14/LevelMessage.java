package q14;

import java.util.*;


public abstract class LevelMessage {

   protected SendMethod sm;

   public void setSendMethod(SendMethod sm) {
      this.sm = sm;
   }

   public abstract void send(String content);

}