package v2.v2ch11.Printf2Test;

/**
   @version 1.10 1997-07-01
   @author Cay Horstmann
*/

class Printf2
{  
   public static native String sprint(String format, double x);
   
   static
   {  
      System.loadLibrary("Printf2");
   }
}

