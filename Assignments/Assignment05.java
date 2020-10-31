// CSE 110 93389: Monday 10:45 AM Section
// Assignment  : 5
// Author      : Ian Booth ID #1219005593
// Description : <of the file contents>
import java.util.Scanner;
import java.util.Arrays;
public class Assignment05 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        // Code to test methods
		displayGreeting();
		String str = scan.nextLine();
		System.out.printf("displayText(\"%s\"): ", str);
		displayText(str);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		printTotal(a, b, c);
		System.out.printf("getTotal(%s,%s,%s) : %s\n", a, b, c, getTotal(a,b,c));
		System.out.printf("getAverage(%s,%s,%s) :%s\n", a, b, c, getAverage(a,b,c));
		String s1 = scan.next();
		String s2 = scan.next();
		String s3 = scan.next();
		System.out.printf("averageLength(%s,%s,%s) :%s\n", s1, s2, s3, averageLength(s1, s2, s3));
		System.out.printf("lengthOfShortest(%s,%s) :%s\n", s1, s2, lengthOfShortest(s1, s2));
		System.out.printf("stringOfStars(%s) :%s\n", s1, stringOfStars(s1));
		System.out.printf("maxStringOfStars(%s,%s) :%s\n", s1, s2, maxStringOfStars(s1, s2));
		System.out.printf("midStringOfStars(%s,%s,%s) :%s\n", s1, s2, s3, midStringOfStars(s1, s2, s3));	

    }
    
    // 1) Write (define) a static method named displayGreeting, 
    //  that takes no arguments and returns no value. 
    //  When this function is called, it should print the text "Hello, and welcome!".
    private static void displayGreeting()
    {
        System.out.println("Hello, and welcome!");
    }
    
    //2) Write (define) a static method named displayText, 
    //  that takes a single String argument and returns no value. 
    //  When this function is called, it should print the value of the argument that was passed to it.
    private static void displayText(String str)
    {
        System.out.printf("%s", str);
    }
    //3) Write (define) a static method named printTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should print the sum of the three arguments passed to it. 
    //  This function should return no value.
    private static void printTotal(int a, int b, int c)
    {
        int sum = a + b + c;
        System.out.printf("%s", sum);
    }
    
    //4) Write (define) a static method named getTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the sum 
    //  of the three arguments passed to it as an int.
    private static int getTotal(int a, int b, int c)
    {
        int sum = a + b + c;
        return sum;
    }
    
    //5) Write (define) a static method named getAverage, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the average 
    //  of the three arguments passed to it as a double.
    private static double getAverage(int a, int b, int c)
    {
        double sum = a + b + c;
        double average = sum / 3;
        return average;
    }
    
    //6) Write (define) a static method named averageLength, 
    //  that takes three String arguments. 
    //  When this function is called, it should return the average length (number of characters) 
    //  of the String arguments passed to it as a double.
    private static double averageLength(String str1, String str2, String str3)
    {
        double length1 = str1.length();
        double length2 = str2.length();
        double length3 = str3.length();
        double average = (length1 + length2 + length3) / 3;
        return average;
    }
    
    //7) Write (define) a static method named lengthOfShortest, 
    //  that takes two String arguments. When this function is called, 
    //  it should return the length (number of characters) 
    //  of the shortest String argument passed to it as an int.
    private static int lengthOfShortest(String str1, String str2)
    {
        int shortestLength = 0;

        if (str2.length() < str1.length())
        {
            shortestLength = str2.length();
        }
        else
        {
            shortestLength = str1.length();
        }
        return shortestLength;
    }
    
    //8) Write (define) a static method named stringOfStars, 
    //  that takes one String argument.
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the string argument passed to it.
    private static String stringOfStars(String str)
    {
        String asterisk = " ";
        for (int i = 0; i < str.length(); i++)
        {
           asterisk += "*";
        }     
        return asterisk;   
    }
    
    //9) Write (define) a static method named maxStringOfStars, 
    //  that takes two String arguments. 
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the longest string argument passed to it.
    private static String maxStringOfStars(String str1, String str2)
    {
        String asterisk = " ";
        if (str1.length() >= str2.length())
        {
            for (int i = 0; i < str1.length(); i++)
            {
                asterisk += "*";
            }
        }
        else
        {
            for (int i = 0; i < str2.length(); i++)
            {
                asterisk += "*";
            }
        }
        return asterisk;
    }
    
    //10) Write (define) a static method named midStringOfStars, 
    //   that takes three String arguments. 
    //   When this function is called, it should return a String of asterisks (*) 
    //   that is the same length as the string argument with the length 
    //   that would be in the middle if the lengths of the arguments were arranged in ascending order.
    private static String midStringOfStars(String str1, String str2, String str3)
    {
        String asterisks = " ";
        int[] lengths = {str1.length(), str2.length(), str3.length()};
        Arrays.sort(lengths);
        int midLength = lengths[1];
        for (int i = 0; i < midLength; i++)
        {
            asterisks += "*";
        }
        return asterisks;
    }

}
