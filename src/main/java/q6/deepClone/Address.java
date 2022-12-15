package q6.deepClone;


import java.io.Serializable;

public class Address implements Serializable {

   private String name;

   public void setName(String name) {
      this.name =name;
   }

   public String getName() {
      return this.name;
   }

}