/*-------------------------------------------------------------
// AUTHOR: Ian Booth
// FILENAME: Lab5.java
// SPECIFICATION: This menu program uses algorithms to create
images given dimsneions.
// FOR: CSE 110: Lab 5
// TIME SPENT: 2 hours
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab5 
{
    public static void main(String[] args) 
    {
        final char SIDE_SYMB = '-';
        final char MID_SYMB = '*';
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        char choice = ' ';
        int numSymbols = -1, sideWidth = -1, midWidth = -1;

        do 
        {
            displayMenu();
            inputStr = scanner.nextLine();
            if (inputStr.length() > 0) 
            {
                choice = inputStr.charAt(0);
            }

            switch (choice) 
            {
            case 'r':
                System.out.println("Width of the sides?");
                sideWidth = scanner.nextInt();
                System.out.println("Width of the middle?");
                midWidth = scanner.nextInt();
                scanner.nextLine();  // Flush junk newline symbols

                System.out.println();
                System.out.println(buildRow(SIDE_SYMB, sideWidth, MID_SYMB, midWidth));

                break;
            case 'p':
                System.out.println("Number of symbols on the lowest layer?");
                numSymbols = scanner.nextInt(); 
                scanner.nextLine();  // Flush junk newline symbols

                System.out.println();
                System.out.println(buildPyramid(SIDE_SYMB, MID_SYMB, numSymbols));

                break;
            case 'd':
                System.out.println("Number of symbols on the middle layer?");
                numSymbols = scanner.nextInt();
                scanner.nextLine();  // Flush junk newline symbols

                System.out.println();
                System.out.println(buildDiamond('*', ' ', numSymbols));

                break;
            case 'q':
                System.out.println("Bye");
                break;
                
            default:
                System.out.println("Please choose a valid option from the menu.");
                break;
            }
            System.out.println();
        } while (choice != 'q');
        
        scanner.close();
    }

    private static String buildRow(char sideSymb, int sideWidth, char midSymb, int midWidth) 
    {
        String result = "";
        String leftSide = "";
        String mid = "";
        String rightSide = "";

        for (int i = 0; i < sideWidth; i++)
        {
            leftSide += sideSymb;
            rightSide += sideSymb;
        }

        for (int i=0; i < midWidth; i++)
        {
            mid += midSymb;
        }
 
        result += leftSide + mid + rightSide;


        return result;
    }

    private static String buildPyramid(char sideSymb, char midSymb, int numSymbols) 
    {

        String result = "";
        int sideWidth = -1, midWidth = -1;

        if (numSymbols % 2 == 0)
        {
            System.out.println("The input is not an odd number. Using the closest odd number.");
            numSymbols--;
        }
        
        for (int i=1; i<= (numSymbols +1) / 2; i++)
        { 
            midWidth = 2 * i - 1;
            sideWidth = (numSymbols - midWidth) / 2;
            result += buildRow(sideSymb, sideWidth, midSymb, midWidth) + "\n";  
        }

        return result;
    }

    private static String buildDiamond(char sideSymb, char midSymb, int numSymbols)
    {

        String result = "";
        int sideWidth = numSymbols / 2;
        int midWidth = 0;
        if (numSymbols % 2 == 0)
        {
            System.out.println("The input is not an odd number. Using the closest odd number.");
            numSymbols--;
        }
        for (int i = 0; i < numSymbols; i++)
        {
            if (i <= (numSymbols / 2))
            {
                sideWidth = numSymbols / 2 - i;
                midWidth = i * 2 + 1;
            }
            else
            {
                sideWidth = i - (numSymbols / 2);
                midWidth = numSymbols - (sideWidth * 2);
            }
            result += buildRow(sideSymb, sideWidth, midSymb, midWidth) + "\n";
        }
        return result;
    }
    
    private static void displayMenu()
    {
        System.out.println("Please choose one pattern from the list:");
        System.out.println("r) Row");
        System.out.println("p) Pyramid");
        System.out.println("d) Shallow diamond");
        System.out.println("q) Quit");
    }  

}