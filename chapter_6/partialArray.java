import java.util.Scanner;
public class partialArray
{
	public static void main(String[] args)
	{
		/**
		*If we don't know how many elements are needed for
		*an array, try setting a LENGTH variable with a value
		*higher than what should be required. This is a 
		*partially filled array.
		*/
		Scanner in = new Scanner(System.in);
		final int LENGTH = 5;
		int[] array = new int[LENGTH];

		int currentSize = 0;
		System.out.println("Enter the next number for the array.");
		while (in.hasNextDouble())
		{
			if (currentSize < array.length)
			{
				array[currentSize] = in.nextInt();
				currentSize++;
			}
			else
			{
				System.out.println("Input not accepted (Array full)\n");
				break;
			}
		}
		System.out.println("Completed array: ");

		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]);
		}
	}
}