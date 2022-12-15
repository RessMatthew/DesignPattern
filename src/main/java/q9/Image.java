package q9; /***********************************************************************
 * Module:  Image.java
 * Author:  RessMatthew
 * Purpose: Defines the Class Image
 ***********************************************************************/

import java.util.*;

/** @pdOid c88cf4ad-0f40-4f32-9234-e4e668cf6f13 */
public abstract class Image {
   /** @pdRoleInfo migr=no name=Filter assc=association1 type=Aggregation */
   public Filter filter;
   
   /** @param imp
    * @pdOid ad836dd4-1299-4a70-8731-3ba958f76c5a */
   public void setImageFilter(Filter imp) {
      this.filter = imp;
   }
   
   /** @param fileName
    * @pdOid 8449d96a-dd47-4a10-bb56-8f5adaefe885 */
   public abstract void parseFile(String fileName);

}