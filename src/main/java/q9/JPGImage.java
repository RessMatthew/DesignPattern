package q9; /***********************************************************************
 * Module:  JPGImage.java
 * Author:  RessMatthew
 * Purpose: Defines the Class JPGImage
 ***********************************************************************/

import java.util.*;

/** @pdOid cd3c1d23-dbc2-41d5-afd5-567ea167dcf0 */
public class JPGImage extends Image {

   @Override
   public void parseFile(String fileName) {
      filter.display();
      System.out.println(fileName+"格式为JPG,");
   }
}