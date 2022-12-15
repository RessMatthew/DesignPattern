package q10;

import q10.AbstractGroup;

import java.util.*;

public class Group extends AbstractGroup {

   private ArrayList<AbstractGroup> memberList = new ArrayList<AbstractGroup>();

   private String name;

   public Group(String name){
      this.name = name;
   }

   @Override
   public void add(AbstractGroup m) {
      memberList.add(m);
   }

   @Override
   public void share() {
      System.out.println("发送给"+name+"分组全部用户");
      for(AbstractGroup obj:memberList){
         obj.share();
      }
   }

}