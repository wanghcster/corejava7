package v2.v2ch11.Printf1Test;

/**
   @version 1.10 1997-07-01
   @author Cay Horstmann
*/

class Printf1
{  
   public static native int print(int width, int precision, double x);

   static
   {  
      System.loadLibrary("Printf1");
   }
}

