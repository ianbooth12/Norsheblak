
/*-------------------------------------------------------------
//AUTHOR: Ian Booth
//FILENAME: Lab6.java
//SPECIFICATION: This program takes prices in AZ and determines
    if one can save based on another state's sales tax
//FOR: CSE 110 - Lab #6
//TIME SPENT: 1 hour
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab6
{
    public static void main(String[] args)
    {
        /* Some variables */
        Scanner scan = new Scanner(System.in);

        /* Get the retail price of something */
        double rpLaptop = -1;
        double rpPhone = -1;
        double rpBackpack = -1;
        
        // >>>>> YOUR CODE HERE <<<<<
        rpLaptop = readRetailPrice("laptop", scan);
        rpPhone = readRetailPrice("mobile phone", scan);
        rpBackpack = readRetailPrice("backpack", scan);

        /* Compute after-tax prices in one state with those in AZ */
        System.out.println("Enter one state you'd like to compare after-tax prices: ");
        String targetState = scan.next();
        double targetStateTax = getSalesTaxRate(targetState);

        /* Compute the after-tax prices */
        double afterTaxAZ = addTax(rpLaptop) + addTax(rpPhone) + addTax(rpBackpack);
        double afterTaxTarget = addTax(rpLaptop, targetStateTax) + addTax(rpPhone, targetStateTax)
                + addTax(rpBackpack, targetStateTax);
        double diff = afterTaxAZ - afterTaxTarget;

        /* Show the total after-tax prices of your stuff in AZ and the target state */
        System.out.println();
        System.out.printf("The total after-tax price in AZ: %.2f\n", afterTaxAZ);
        System.out.printf("The total after-tax price in %s: %.2f\n", targetState, afterTaxTarget);

        /* Show whether you have a chance to save */
        if (diff > 0)
        {
            System.out.printf("You may save $%.2f for these items in %s.\n", diff, targetState);
        }
        else
        {
            diff = diff * -1;
            System.out.printf("You may save $%.2f for these items in Arizona.", diff);
        }

        scan.close();
    }

    /**
     * Prompt and ask the user for the price of something. The price must be
     * non-negative.
     * 
     * @param name the name of something
     * @param scan a Scanner object
     * @return the price user inputs
     */
    private static double readRetailPrice(String name, Scanner scan)
    {
        double retailPrice = -1;
        do
        {
            System.out.println("Enter the retail price of your " + name +".");
            retailPrice = scan.nextDouble();
            if (retailPrice < 0)
            {
                System.out.println("The price cannot be negative. Please enter a valid price.\n");
            }
            else
            {
                break;
            }
        }
        while (retailPrice < 0);
        
        return retailPrice;
    }

    /**
     * Add the sales tax of AZ to a price and return the result.
     * 
     * @param price
     * @return the after-tax price
     */
    private static double addTax(double price)
    {
        double taxRate = 8.40;
        price = price * (1 + (taxRate / 100));
        return price;
    }

    /**
     * Add a sales tax to a price and return the result.
     * 
     * @param price
     * @param rate  sales tax in percent
     * @return the after-tax price
     */
    private static double addTax(double price, double rate)
    {

        price = price * (1 + (rate / 100));
        
        return price;
    }

    /**
     * Get the sales tax for a given state.
     * 
     * @param state an abbreviation of a state in the US
     * @return the sales tax in percent
     */
    private static double getSalesTaxRate(String state)
    {
        double SALES_TAX_AZ = 8.40;
        double SALES_TAX_CA = 8.66;
        double SALES_TAX_NV = 8.32;
        double SALES_TAX_UT = 7.18;
        double SALES_TAX_CO = 7.65;
        double SALES_TAX_NM = 7.82;
        double SALES_TAX_OR = 0.00;

        double rt = 0;
        switch (state)
        {
        case "AZ":
            rt = SALES_TAX_AZ;
            break;
        case "CA":
            rt = SALES_TAX_CA;
            break;
        case "NV":
            rt = SALES_TAX_NV;
            break;
        case "UT":
            rt = SALES_TAX_UT;
            break;
        case "CO":
            rt = SALES_TAX_CO;
            break;
        case "NM":
            rt = SALES_TAX_NM;
            break;
        case "OR":
            rt = SALES_TAX_OR;
            break;
        default:
            System.out.println("[WARN] The current database does not have sales tax info for " + state + ". Set to 0");
        }

        return rt;
    }
}
