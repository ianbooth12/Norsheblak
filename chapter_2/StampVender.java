import java.util.Scanner;
public class StampVender
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		final int STAMP_PRICE = 30; // Prices shown in pennies
		System.out.print("Insert a number of dollars: ");
		int dollars = in.nextInt();

		int stamps_given = 100 * dollars / STAMP_PRICE; // Mult by 100 to put in pennies
		int change = 100 * dollars - (stamps_given * STAMP_PRICE);

		System.out.printf("First class stamps given: %4d%n", stamps_given);
		System.out.printf("Change given: %4d cents%n", change);
	}
}