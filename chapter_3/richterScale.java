import java.util.Scanner;
public class richterScale
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the rating of the earthquake on the Richter Scale: ");
		double magnitude = in.nextDouble();
		if (magnitude >= 8)
		{
			System.out.print("Most structures are going to fall in this earthquake");
		}
		else if (magnitude >= 7)
		{
			System.out.print("Many buildings will be destroyed");
		}
		else if (magnitude >= 6)
		{
			System.out.print("Many building will have considerable damage, some may collapse.");
		}
		else if (magnitude >= 4.5)
		{
			System.out.print("Poorly constructed buildings will take some damage.");
		}
		else
		{
			System.out.print("There won't be much noticable damage.");
		}
	}
}z