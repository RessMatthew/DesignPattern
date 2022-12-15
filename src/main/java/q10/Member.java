package q10;

import java.util.*;

public class Member extends AbstractGroup {

   private String name;

   public Member(String name){
      this.name = name;
   }

   @Override
   public void share() {
      System.out.println("分享给"+name+"信息");
   }

   @Override
   public void add(AbstractGroup m) {
      System.out.println("对不起，不支持该方法");
   }

}