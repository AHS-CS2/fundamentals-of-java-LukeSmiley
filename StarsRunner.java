//� A+ Computer Science
//www.apluscompsci.com

//Name - Luke Smiley
//Date - 1/28/26
//Class  Comp Sci 1
//Lab  - Stars Runner

import static java.lang.System.*;

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
      StarsAndStripes flag =  new StarsAndStripes();
      //call the methods needed to make the patterns on the word document
      
      flag.printTwentyStars();
      flag.printTwentyDashes();
      flag.printTwentyStars();
      flag.printTwentyDashes();
      flag.printTwoBlankLines();
      flag.printASmallBox();
      flag.printTwentyDashes();
      flag.printABigBox();
   }
}