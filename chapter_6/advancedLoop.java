public class advancedLoop
{
	public static void main(String[] args)
	{
		int total = 0;
		int[] array = {1,5,8,3,1,5,7,8};
		for (double value : array) // format (variable, array name) optional format for loop;ing arrays
		{
			total += value;
		}
		System.out.println(total);
	}
}