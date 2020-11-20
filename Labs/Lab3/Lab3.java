/*------------------------------------------------------------
// AUTHOR: Ian Booth
// FILENAME: Lab3.java
// SPECIFICATION: This program accepts grades on homework, exam, and midterm, and returns the weighted score
// FOR: CSE 110- Lab #3
// TIME SPENT:  // 2 hours
---------------------------------------*/
import java.util.Scanner;
public class Lab3
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double examScore = 0;
		double midtermScore = 0;
		double homeworkScore = 0;
		int i = 0; // Initializing all variables needed later
		while (i < 3)
		{
			if (i == 0) // Statement for homework grade
			{
				System.out.println("Enter your homework grade: ");
				homeworkScore = in.nextInt();
				if (homeworkScore < 0 || homeworkScore > 100)
				{
					System.out.println("[ERR] The score must be between 0 and 100.");
				}
				else
				{
					i++;
				}
			}
			if(i == 1) // Statement for midterm grade
			{
				System.out.println("Enter your midterm grade: ");
				midtermScore = in.nextInt();
				if (midtermScore < 0 || midtermScore > 100)
				{
					System.out.println("[ERR] The score must be between 0 and 100.");
				}
				else
				{
					i++;
				}
				
			}
			if(i == 2) // Statement for exam grade
			{
				System.out.println("Enter your exam score: ");
				examScore = in.nextInt();
				if(examScore < 0 || examScore > 200)
				{
					System.out.println("[ERR] The score should be between 0 and 200");
				}
				else
				{
					i++;
				}
			}
		}

		double weightedTotal = (examScore / 200 * 50) + (midtermScore * .25) + (homeworkScore * .25); // Equation for weighted total
		if (weightedTotal >= 50)
		{
			System.out.println("[INFO] Student passed the course.");
		}
		else
		{
			System.out.println("[INFO] Student failed the course.");
		}
	}
}