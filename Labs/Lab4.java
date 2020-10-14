/*------------------------------------------------------------
// AUTHOR: Ian Booth
// FILENAME: Lab4.java
// SPECIFICATION: Lab 4 provides an option menu with various math functions.
// FOR: CSE 110- Lab #4
// TIME SPENT:  // 2 hours
---------------------------------------*/
import java.util.Scanner;
public class Lab4
{
	public static void main(String[] args)
	{
		boolean exit = false; // Boolean to decide whether to leave the program
		Scanner in = new Scanner(System.in);
		while (!exit) // While loop determines if exit has been called, loops if not
		{ 
			System.out.println("\nChoose an option from the menu: "); // Menu Options
			System.out.println("1.) Calculate the sum of integers from 1 to a given number.");
			System.out.println("2.) Calculate the factorial of a number.");
			System.out.println("3.) Display the leftmost digit of a number.");
			System.out.println("4.) Quit the program.");
			int option = in.nextInt();
			switch(option) // Switch statement to choose one option
			{
			case 1:
				System.out.println("Enter a number: ");
				int sumNumber = in.nextInt(); 
				int sum = 0;
				for (int i = 1; i <= sumNumber; i++)
				{
					sum = sum + i;
				}
				System.out.printf("The sum from 1 to %d is %d.\n", sumNumber, sum);
				break;

			case 2:
				System.out.println("Enter a number: ");
				int factorialNumber = in.nextInt();
				int product = 1;
				for (int i = 1; i <= factorialNumber; i++)
				{
				product = product * i;
				}
				System.out.printf("The factorial of %d is %d.\n", factorialNumber, product);
				break;

				case 3:
				System.out.println("Enter a number: ");
				int givenNumber = in.nextInt();
				int leftDigit = givenNumber;
				while (leftDigit >= 10)
				{
					leftDigit = leftDigit / 10;
				}
				System.out.printf("The leftmost digit of %d is %d.\n", givenNumber, leftDigit);
				break;
			case 4:
				System.out.println("Program exited.");
				exit = true;
			}	
		}	
	}			
}