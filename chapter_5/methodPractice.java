import java.util.Scanner;
public class methodPractice // Learning to incorporate method
{
	public static void main(String[] args)
	{
		double volume1 = cubeVolume(2);
		double volume2 = cubeVolume(10);
		System.out.printf("The volume of a cube with side lengths of 2 is %.0f.", volume1);
		System.out.printf("\nThe volume of a cube with side lengths of 10 is %.0f.", volume2);
	}

	/**
	Computes the volume of a cube given the side length
	@param sideLength : the length of the cube's sides
	@return the cube's volume
	*/
	public static double cubeVolume(double sideLength)
	{
		double volume = Math.pow(sideLength, 3);
		return volume;
	}
}
