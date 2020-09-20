/*------------------------------------------------------------
CSE 110 93389: Monday 10:45 AM Section 
 Assignment : 2
 Author : Ian Booth ID #1219005593
 Description : This file takes inputs and returns costs and
 metrics for a road construction project.
---------------------------------------*/

import java.util.Scanner;
public class Assignment02
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		double roadLength = 1.0; // Defining varibles which will be inputs
		int laneCount = 1;
		double asphaltDepth = 12; // TAKE NOTE: This metric in inches
		int projectTime = 1;  

		System.out.println("Enter the length of the road in miles: ");
		roadLength = in.nextDouble();
		System.out.println("Enter the number of lanes on the road: ");
		laneCount = in.nextInt();
		System.out.println("Enter the depth of the asphalt in inches: ");
		asphaltDepth = in.nextInt();
		System.out.println("Enter the number of days to complete the project in: ");
		projectTime = in.nextInt();

		double truckCount = Math.ceil(((asphaltDepth / 12) * (laneCount * 12) * (roadLength * 5280)) * 150 / 10000);

		int intersections = (int)roadLength;
		double stoplightCount = (intersections) * (2 + laneCount);

		double conduitCount = Math.ceil(roadLength * 5280 / 24);
		double crewmemberCount = Math.ceil(50 * roadLength * laneCount / projectTime);
		double asphaltCost = truckCount * 5 * 200;
		double stoplightCost = stoplightCount * 25000;
		double conduitCost = conduitCount * 500;
		double laborCost = 8 * projectTime * 25 * crewmemberCount;
		double totalCost = (asphaltCost + stoplightCost + conduitCost + laborCost);

		System.out.print("=== Amount of materials needed ===");
		System.out.printf("\nTruck loads of asphalt: %.0f", truckCount);
		System.out.printf("\nStoplights: %.0f", stoplightCount);
		System.out.printf("\nConduit pipes: %.0f", conduitCount);
		System.out.printf("\nCrew members needed: %.0f", crewmemberCount);
		System.out.print("\n=== Cost of materials ===");
		System.out.printf("\nCost of Asphalt: $%.2f", asphaltCost);
		System.out.printf("\nCost of Spotlights: $%.2f", stoplightCost);
		System.out.printf("\nCost of Conduits: $%.2f", conduitCost);
		System.out.printf("\nCost of labor: $%.2f", laborCost);
		System.out.print("\n=== Cost of the project ===");
		System.out.printf("\nTotal cost of the project: $%.2f", totalCost);
	}
}