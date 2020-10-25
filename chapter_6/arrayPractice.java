public class arrayPractice
{
	public static void main(String[] args)
	{
		double[] values; // Declaring an array, values is the name, still must "create" array
		values = new double[10]; // Initializing 'values' array, similar to creating scanner

		double[] moreValues = {32, 49, 55, 10, 1, 34, 55, 69, 18, 25}; // Arrays can be initialized with values right away

		values[4] = 35; // Modifying an existing value

		System.out.println(values[4]);

		for(int i = 0; i < 10; i++)
		{
			System.out.println(moreValues[i]);
		}
	}
}	