import java.util.Scanner;
public class Tiles
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Total width: ");
		int totalWidth = in.nextInt();
		System.out.print("Tile width: ");
		int tileWidth = in.nextInt();

		int tilePairs = (totalWidth - tileWidth) / (2 * tileWidth);
		int tileCount = (1 + (2 * tilePairs));
		double wallGap = (totalWidth - tileCount * tileWidth) / 2;
		System.out.printf("The gap from wall to tile on each side should be %f inches long.%n", wallGap);
		System.out.printf("Each row will consist of %d tiles.%n", tileCount);
	}
}