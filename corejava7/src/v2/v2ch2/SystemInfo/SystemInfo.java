package v2.v2ch2.SystemInfo;

import java.util.*;

/**
   This program prints out all system properties.
*/
public class SystemInfo
{  
   public static void main(String args[])
   {   
      Properties systemProperties = System.getProperties();
      Enumeration enumSystem = systemProperties.propertyNames();
      systemProperties.list(System.out);
      System.out.println("-------------------");
      
      while (enumSystem.hasMoreElements())
      {
         String key = (String)enumSystem.nextElement();
         System.out.println(key + "=" +
            systemProperties.getProperty(key));
      }
   }
}
