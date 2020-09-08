import java.util.Scanner;
public class floorNumber
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the floor you live on: ");
		int floorNumber = in.nextInt();
		int actualFloor;
		if (floorNumber > 13)
		{
			actualFloor = floorNumber - 1;
		}
		else
		{	
			actualFloor = floorNumber;
		}
		System.out.printf("Press elevator button %d to reach your floor.", actualFloor);
	}
}