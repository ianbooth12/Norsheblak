/*------------------------------------------------------------
// AUTHOR: Ian Booth
// FILENAME: TestAverage.java
// SPECIFICATION: This file requests 3 test scores and creates an average of the scores
// FOR: CSE 110- Lab #1
// TIME SPENT:  //--------------------
---------------------------------------*/

import java.util.Scanner;
public class TestAverage
{
	public static void main(String[] args)
	{
		final double INPUT_COUNT = 3.0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your first test score: "); // Prompt for test 1 score
		double score1 = in.nextInt(); // Input for test 1 score

		System.out.print("%nEnter your second test score: "); // Prompt for test 2 score
		double score2 = in.nextInt(); // Input for test 2 score

		System.out.print("%nEnter your third test score: "); // Prompt for test 3 score
		double score3 = in.nextInt(); // Input for test 3 score

		double testAverage = (score1 + score2 + score3) / (double)INPUT_COUNT;
		System.out.printf("The average score of your tests is %.1f.", testAverage);
	}
}