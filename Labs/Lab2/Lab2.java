/*------------------------------------------------------------
// AUTHOR: Ian Booth
// FILENAME: Lab2.java
// SPECIFICATION: 
// FOR: CSE 110- Lab #2
// TIME SPENT:  // 45 minutes
---------------------------------------*/
import java.util.Scanner;
public class Lab2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName = in.next(); // Declaring and initializing the first name variable

		System.out.print("Enter your last name: ");
		String lastName = in.next(); // Declaring and initializing the last name variable

		String fullName = firstName + " " + lastName; // Declaring and initializing full name
		fullName = fullName.toUpperCase(); // Capitalizing the full name

		int nameLength = fullName.length(); // Initializing with the length of fullName

		System.out.printf("\nFull name (in capitals): %s\n", fullName);
		System.out.printf("Name length: %d characters", nameLength);

		String str1 = new String("Mason");
		String str2 = "Mason";

		if (str1 == str2) // Testing the == method with strings
		{
			System.out.print("\nComparing strings with == works.");
		}
		else
		{
			System.out.print("\nComparing strings with == does not work.");
		}

		if (str1.equals(str2)) // Testing the .equals method of comparing strings
		{
			System.out.print("\nComparing strings with .equals works.");
		}
		else
		{
			System.out.print("\nComparing strings with .equals does not work.");
		}
	}
}