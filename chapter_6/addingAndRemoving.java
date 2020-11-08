import java.util.Arrays;
public class addingAndRemoving
{

	public static void main(String[] args) 
	{
		double[] values = new double[10];
		int currentSize = 0;
		if (currentSize < values.length)
		{
			for (int i = 0; i < values.length; i++)
			{
				values[i] = Math.round(Math.random() * 10);
				currentSize++;
			}
		}
		
		//Removing a random item from the array
		for (int  i = 0; i < currentSize; i++)
		{
			System.out.print(values[i]);
			System.out.print(" | ");
		}
		System.out.printf("Current length: %d\n", currentSize);

		values[3] = values[currentSize - 1];
		currentSize--;
		for (int  i = 0; i < currentSize; i++)
		{
			System.out.print(values[i]);
			System.out.print(" | ");
		}
		System.out.printf("Current length: %d\n", currentSize);

		/** 
		If the order of the array needs to
		be maintained, there are additional
		commands which need to be inserted
		*/
		int pos = 4;
		for (int i = pos + 1; i < values.length; i++)
		{
			values[i - 1] = values[i];
		}
		currentSize--;
		for (int  i = 0; i < currentSize; i++)
		{
			System.out.print(values[i]);
			System.out.print(" | ");
		}
		System.out.printf("Current length: %d\n", currentSize);

		// INSERTING VALUES

		// Inserting at random
		if (currentSize < values.length)
		{
			currentSize++;
			values[currentSize - 1] = 5;
		}
		for (int  i = 0; i < currentSize; i++)
		{
			System.out.print(values[i]);
			System.out.print(" | ");
		}
		System.out.printf("Current length: %d\n", currentSize);
		// Inserting at a certain position
	}
}