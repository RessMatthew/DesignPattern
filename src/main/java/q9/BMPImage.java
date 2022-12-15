package q9; /***********************************************************************
 * Module:  BMPImage.java
 * Author:  RessMatthew
 * Purpose: Defines the Class BMPImage
 ***********************************************************************/

import java.util.*;

/** @pdOid fc2d645d-eb5c-4c33-8314-3180016268a9 */
public class BMPImage extends Image {

   @Override
   public void parseFile(String fileName) {
      filter.display();
      System.out.println(fileName+"格式为BMP,");
   }

}