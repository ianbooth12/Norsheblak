import java.util.Scanner;
public class Names
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Jamal said\"Go to my website tit.com\\nore");
		System.out.print("Enter your first and last name: ");
		String firstName = in.next();
		String lastName = in.next();
		System.out.println(lastName + ", " + firstName);
		
	}
}