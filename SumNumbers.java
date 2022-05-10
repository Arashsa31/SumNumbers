import java.util.Scanner;

/**
 * @author Arash
 * 
 * Assuming you have two integers, x and y, with y bigger than x.
 * Sum all the numbers from x to y.
 * Example: If x is 1 and y is 5, then the sum is 1+2+3+4+5 = 15.
 */
public class SumNumbers 
{
	public static void main(String[] args) 
	{
		//take user input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter x and y, where y is bigger, to find the sum between the two numbers.");
		System.out.print("Enter the first integer x: ");
		int x = keyboard.nextInt();
		System.out.print("Enter the second integer y: ");
		int y = keyboard.nextInt();
		
		//check for validity
		if (x > y)
		{
			System.out.println("INVALID INPUT\nGoodbye.");
			System.exit(0);
		}
		
		//prints sum of numbers
		else 
			System.out.println(sum(x, y));	
		
		//close scanner object
		keyboard.close();		
	}
	
	static int sum(int x, int y)
	{
		int sum;
		for (sum=0; x<=y; x++)
			{
				sum = sum + x;		
			}
		return sum;
	}
}
