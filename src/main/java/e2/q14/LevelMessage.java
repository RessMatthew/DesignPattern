package e2.q14;


public abstract class LevelMessage {

   protected SendMethod sm;

   public void setSendMethod(SendMethod sm) {
      this.sm = sm;
   }

   public abstract void send(String content);

}