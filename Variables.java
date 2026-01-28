//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Luke Smiley
//Date - 1/23/26
//Class - Comp Sci 1
//Lab  - Variables

public class Variables
{
	public static void main ( String[] args )
	{
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
		byte byteOne = 127;
		short shortOne = -32123;
		int intOne = 90877;
		long longOne = 999999999L;

		//decimal variables
		float floatOne = 38.5678F;
		double doubleOne = 923.234;

		//other integer types
		char charOne = 'A';

		//other types
		boolean booleanOne = true;
		String StringOne = "hello world";

		//output your information here
		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*        integer types          *");
		System.out.println("*                               *");
		System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
		System.out.println("*16 bit - shortOne = "+shortOne+"\t*");
		System.out.println("*32 bit - intOne = "+intOne+"\t*");
		System.out.println("*64 bit - longOne = "+longOne+"\t*");
		System.out.println("*\t\t\t\t*");
		System.out.println("*\t real types \t\t*");
		System.out.println("*\t\t\t\t*");
		System.out.println("*32 bit - floatOne = "+floatOne+"\t*");
		System.out.println("*64 bit - doubleOne = "+doubleOne+"\t*");
		System.out.println("*\t\t\t\t*");
		System.out.println("*\t other integer types \t*");
		System.out.println("*\t\t\t\t*");
		System.out.println("*16 bit - charOne = "+charOne+"\t\t*");
		System.out.println("*\t\t\t\t*");
		System.out.println("*\t other types \t\t*");
		System.out.println("*\t\t\t\t*");
		System.out.println("*booleanOne = "+booleanOne+"\t\t*");
		System.out.println("*stringOne = "+StringOne+"\t*");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	}
}