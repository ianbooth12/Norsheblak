/*------------------------------------------------------------
// AUTHOR: Ian Booth
// FILENAME: Lab4.java
// SPECIFICATION: 
// FOR: CSE 110- Lab #4
// TIME SPENT:  // 
---------------------------------------*/
import java.util.Scanner;
public class Lab4
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Choose an option from the menu: ");
		System.out.println("1.) Calculate the sum of integers from 1 to a given number.");
		System.out.println("2.) Calculate the factorial of a number.");
		System.out.println("3.) Display the leftmost digit of a number.");
		System.out.println("4.) Quit the program.");

		int option = in.nextInt();

		switch(option)
		{
		case 1:
			System.out.println("Enter a number: ");
			int sumNumber = in.nextInt();
			int sum = 0;
			for (i = 1; i <= sumNumber; i++)
			{
				sum = sum + i;
			}
			System.out.printf("\nThe sum from 1 to %d is %d.", sumNumber, sum);
			break;

		case 2:
			System.out.println("Enter a number: ");
			int factorialNumber = in.nextInt();
			int product = 1;
			for (int i = 1; i <= factorialNumber; i++)
			{
				product = product * i;
			}
			System.out.printf("\nThe factorial of %d is %d.", factorialNumber, product);
			break;

		case 3:
			System.out.println("Enter a number: ");
			int givenNumber = in.nextInt();
			for (int i = 1; i >= 10; i++)
			{
				temp / 10;
			}
			System.out.printf("\nThe leftmost digit of %d is %d.", givenNumber, temp);
			break;
		case 4:
			System.out.println("Program exited.");
		}	
		
	}
}