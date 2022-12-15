package q9; /***********************************************************************
 * Module:  GIFImage.java
 * Author:  RessMatthew
 * Purpose: Defines the Class GIFImage
 ***********************************************************************/

import java.util.*;

/** @pdOid c4da3421-558d-4207-bacf-4324247dd426 */
public class GIFImage extends Image {

   @Override
   public void parseFile(String fileName) {
      filter.display();
      System.out.println(fileName+"格式为GIF,");
   }

}