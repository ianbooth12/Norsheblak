/*------------------------------------------------------------
CSE 110 93389: Monday 10:45 AM Section 
 Assignment : 3
 Author : Ian Booth ID #1219005593
 Description : 
---------------------------------------*/

import java.util.Scanner;
public class Assignment03
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int numShares = 0; // Declaring/initializing user input values
		int purchasePrice = 0;
		int marketPrice = 0;
		int buyingPower = 0;

		System.out.println("Enter the number of shares owned: "); // Collecting user inputs 
		numShares = in.nextInt();
		System.out.println("Enter the price paid for your shares owned currently: ");
		purchasePrice = in.nextInt();
		System.out.println("Enter the current market price per share: ");
		marketPrice = in.nextInt();
		System.out.println("Enter how much buying power is available: ");
		buyingPower = in.nextInt();

		double numSharesToBuy = Math.floor((buyingPower - 10) / (marketPrice)); // Buying calculations
		double totalBuyCost = 10 + marketPrice * numSharesToBuy;

		int perShareBuyValue = purchasePrice - marketPrice; // Preliminary values
		int perShareSellValue = marketPrice - purchasePrice;

		double totalBuyValue = perShareBuyValue * numSharesToBuy;
		int totalSellValue = perShareSellValue * numShares;

		if (totalBuyValue > 10)
		{
			System.out.printf("Buy %.0f share(s).\n", numSharesToBuy); // If true, buys shares
		}
		else if (totalSellValue > 10)
		{
			System.out.printf("Sell %d share(s).\n", numShares); // If true, sells shares
		}
		else
		{
			System.out.print("Hold share(s)."); // Holds shares
		}
	}
}