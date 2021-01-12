public class simpleClass
{
	public static void main(String[] args) 
	{
		Counter tally = new Counter();
		tally.count();
		tally.count();
		int result = tally.getValue(); // Tally can call methods from the "Counter" class

		tally.count();
		tally.count();
		result = tally.getValue(); // Tally now equals 4, rather than 2
		System.out.println(result);
	}
}

