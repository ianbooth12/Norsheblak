import java.util.Scanner;
public class middleCharacter
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String str = in.next();
		if (str.length() % 2 == 1)
		{
			int position;
			String character;
			position = (str.length() / 2);
			character = (str.substring(position, position + 1));
			System.out.printf("The middle character of this word is %s.", character);
		}
		else
		{
			int position;
			String character;
			position = (str.length()/ 2 - 1);
			character = (str.substring(position, position + 2));
			System.out.printf("The middle characters of this word are %s.", character);
		}
	}
}