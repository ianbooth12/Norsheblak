/*------------------------------------------------------------
CSE 110 93389: Monday 10:45 AM Section 
 Assignment : 1
 Author : Ian Booth ID #1219005593
 Description : This file accepts inputs for a pizza party,
 distributing the slices fairly for adults and children.
---------------------------------------*/

import java.util.Scanner;
public class Assignment01
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the amount of pizzas being ordered: "); // Declaring/initializing pizzas ordered
		int pizzaCount = in.nextInt();

		System.out.print("Enter how many slices are in each pizza: "); // Declaring/initializing slice count
		int slicesPerPizza = in.nextInt();

		System.out.print("Enter how many adults will be at the party: "); // Declaring/initializing adult count
		int adultCount = in.nextInt();

		System.out.print("Enter how many kids will be at the party: "); // Declaring/initializing kid count
		int childCount = in.nextInt();

		final int SLICES_PER_ADULT = 2; // Declaring/initializing amount of slices per adult

		int sliceTotal = pizzaCount * slicesPerPizza; // Equation to find slice total
		
		int adultSliceTotal = (adultCount * SLICES_PER_ADULT); // Computations for outputs

		int childSliceTotal = sliceTotal - adultSliceTotal;

		int slicesPerChild = childSliceTotal / childCount;

		int leftoverSlices = childSliceTotal % childCount;

		System.out.printf("\nTotal number of slices of pizza: %d", sliceTotal); // Output Statements
		System.out.printf("\nTotal number of slices given to adults: %d", adultSliceTotal);
		System.out.printf("\nTotal number of slices available for children: %d", childSliceTotal);
		System.out.printf("\nNumber of slices each child will get: %d", slicesPerChild);
		System.out.printf("\nNumber of slices left over: %d", leftoverSlices);
	}
}