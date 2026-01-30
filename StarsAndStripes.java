//� A+ Computer Science
//www.apluscompsci.com

//Name - Luke Smiley
//Date - 1/28/26
//Class - Comp Sci 1
//Lab  - Stars and Stripes

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      System.out.println("StarsAndStripes");
      printTwoBlankLines();
   }
   public void printTwentyStars()
   {
      System.out.println("******************** ");
   }
   public void printTwentyDashes()
   {
      System.out.println("-------------------- ");
   }
   public void printTwoBlankLines()
   {
      System.out.print("\n\n");
   }
   public void printASmallBox()
   {	
      printTwentyStars();
      printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
   }
   public void printABigBox()
   { 	
      printASmallBox();
      printASmallBox();
   }   
}