package q6.shallowClone;


public class Customer extends Object implements Cloneable{

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
      Object object = null;
      try {
         object = super.clone();
      }catch (Exception e){
         e.printStackTrace();
      }
      return (Customer) object;
   }

}