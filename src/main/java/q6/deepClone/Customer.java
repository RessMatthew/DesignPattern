package q6.deepClone;


import q6.deepClone.Address;

import java.io.*;

public class Customer implements Serializable {

   private String name;

   private boolean gender;

   public Address address;

   public void setAddress(Address address) {
      this.address = address;
   }

   public Address geAddress() {
      return this.address;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setGender(boolean gender) {
      this.gender = gender;
   }

   public boolean getGender() {
      return this.gender;
   }

   @Override
   public Customer clone(){
      try {
         //将对象写入流中
         ByteArrayOutputStream bao = new ByteArrayOutputStream();
         ObjectOutputStream oss = new ObjectOutputStream(bao);
         oss.writeObject(this);
         //将对象从流中取出
         ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
         ObjectInputStream ois = new ObjectInputStream(bis);
         return (Customer) ois.readObject();
      } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
         return null;
      }
   }

}