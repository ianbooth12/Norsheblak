import java.util.Scanner; // Imports the scanner utility to detect inputs 
public class ScannerTest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); // Initializes the scanner

		System.out.print("Enter how many bottles are in the fridge:"); // Prompt
		int bottles = in.nextInt();
		System.out.println("Amount of bottles in the fridge: " + bottles);
	}
}

