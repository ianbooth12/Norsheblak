/*------------------------------------------------------------
CSE 110 93389: Monday 10:45 AM Section 
 Assignment : 4
 Author : Ian Booth ID #1219005593
 Description : This file generates a 4 digit integer and the
 user guesses number by number
---------------------------------------*/
import java.util.Scanner;
public class Assignment04
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		playGame();
	}
	

	/**
	Computes the process of the game,
	including all other methods
	*/
	private static void playGame()
	{
		Scanner in = new Scanner(System.in);
		int userGuess = 0;
		int length = String.valueOf(userGuess).length();
		boolean play = true;
		while (play)
		{	
			int gameNumber = newNumber();
			String randomNumber = String.valueOf(gameNumber);
			System.out.println(">>>MASTERMIND<<<");
			System.out.println("Enter your guess of the 4 digit number!");
			do
			{
				userGuess = in.nextInt();
				length = String.valueOf(userGuess).length();
				if (length != 4)
				{
					System.out.println("Please enter a number with a length of 4 digits.");
				}
			}
			while (length != 4);
			String userNumber = String.valueOf(userGuess);
			numberTester(userNumber, randomNumber);
			System.out.printf("\nCongratulations! You guessed the random number %d\n", gameNumber);
			System.out.println("Would you like to play again?");
			System.out.println("1.) Yes");
			System.out.println("2.) No");
			if (in.nextInt() == 2)
			{
				play = false;
			}
		}
	}
	/** 
	Generates a random 4 digit
	number for the game
	@return 4-digit rounded number
	*/
	private static int newNumber()
	{
		double initial = Math.random();
		double rangeAdjusted = initial * (10000 - 1001) + 1000;
		int rounded = (int)Math.round(rangeAdjusted);
		return rounded;
	}	

	/**
	Tests the user input against
	the generated number
	@param userNumber holds the user's guess
	@param randomNumber hold's the machine's generated
	number
	*/
	private static void numberTester(String userNumber, String randomNumber)
	{
		Scanner in = new Scanner(System.in);
		int digitsEqual = 0;
		while (digitsEqual != 4)
		{
			digitsEqual = 0;
			for (int i = 0; i < userNumber.length(); i++)
			{
			
				char userResult = userNumber.charAt(i);
				char randomResult = randomNumber.charAt(i);
				if (userResult == randomResult)
				{
					digitsEqual = digitsEqual + 1;
				}
			}
			System.out.printf("You matched %d digits.\n", digitsEqual);
			if (digitsEqual != 4)
			{
				do
				{
					System.out.printf("\nEnter another number: ");
					int updatedNumber = in.nextInt();
					userNumber = String.valueOf(updatedNumber);
					if (userNumber.length() != 4)
					{
						System.out.println("Please enter a number with 4 digits.");
					}
				}
				while (userNumber.length() != 4);
			}
			else
			{
				break;
			}
		}	
	}
}