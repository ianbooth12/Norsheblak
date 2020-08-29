import java.util.Scanner;
public class RoundoffTest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("What is the price per gallon of gas?: ");
		double price = in.nextDouble();
		System.out.printf("The price of gas right now is $%.2f per gallon", price);
	}
} 