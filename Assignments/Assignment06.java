// CSE 110 93389: Monday 10:45 AM Section
// Assignment  : 6
// Author      : Ian Booth ID #1219005593
// Description : Ten methods manipulating arrays
import java.util.Scanner;
import java.util.Arrays;

public class Assignment06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int arrSize = scan.nextInt();
		int[] arr = new int[arrSize];
		for(int i = 0; i < arrSize; i++)
			arr[i] = scan.nextInt();
		int[] arrCopy = Arrays.copyOf(arr, arrSize);
		String sep = scan.next();
		int idx1 = scan.nextInt(), idx2 = scan.nextInt();
		
		//Method 1
		System.out.printf("printArray(%s,\"%s\"): ", Arrays.toString(arr), sep);
		printArray(arr, sep);
		System.out.println();
		
		//Method 2
		System.out.printf("getFirst(%s): %d\n", Arrays.toString(arr), getFirst(arr));
		
		//Method 3
		System.out.printf("getLast(%s): %d\n", Arrays.toString(arr), getLast(arr));
		
		//Method 4
		System.out.printf("getAllButFirst(%s): %s\n", Arrays.toString(arr), Arrays.toString(getAllButFirst(arr)));
		
		//Method 5
		System.out.printf("getIndexOfMin(%s): %d\n", Arrays.toString(arr), getIndexOfMin(arr));
		
		//Method 6
		System.out.printf("getIndexOfMax(%s): %d\n", Arrays.toString(arr), getIndexOfMax(arr));
		
		//Method 7
		arr = swapByIndex(arr, idx1, idx2);
		System.out.printf("swapByIndex(%s, %d, %d): %s\n", Arrays.toString(arrCopy), idx1, idx2, Arrays.toString(arr));
		
		//Method 8
		System.out.printf("removeAtIndex(%s, %d): %s\n", Arrays.toString(arr), idx1, Arrays.toString(removeAtIndex(arr, idx1)));
		
		//Method 9
		System.out.printf("insertAtIndex(%s, %d, 100): %s\n", Arrays.toString(arr), idx2, Arrays.toString(insertAtIndex(arr, idx2, 100)));
		
		//Method 10
		System.out.printf("isSorted(%s): %s\n", Arrays.toString(arr), isSorted(arr));

    }
    
    // 1) Write a public static method named printArray, 
    //   that takes two arguments. The first argument is an Array of int 
    //   and the second argument is a String. The method should print out 
    //   a list of the values in the array, each separated by the value of the second argument.
    public static void printArray(int[] values, String sep)
    {
        for (int i = 0; i < values.length; i++)
        {
            System.out.print(values[i]);
            if (i < values.length - 1)
            {
                System.out.print(sep);
            }
        }
        System.out.print("\n");
    }  
    
    // 2) Write a public static method named getFirst, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the first element of the array.
    public static int getFirst(int[] values)
    {
        return values[0];
    }
    
    // 3) Write a public static method named getLast, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the last element of the array.
    public static int getLast(int[] values)
    {
        int end = values.length - 1;
        return values[end];
    }
    
    // 4) Write a public static method named getAllButFirst, 
    //    that takes an Array of int as an argument and creates and returns 
    //    a new array with all of the values in the argument array except the first value.
    public static int[] getAllButFirst(int[] values)
    {
        int newLength = values.length - 1;
        int[] newValues = new int[newLength];
        for (int i = 1; i < values.length; i++)
        {
            newValues[i-1] = values[i];
        }
        return newValues;
    }
    
    // 5) Write a public static method named getIndexOfMin, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the least value in the array.
    public static int getIndexOfMin(int[] values)
    {
        Arrays.sort(values);
        return values[0];
    }
    
    // 6) Write a public static method named getIndexOfMax, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the largest value in the array.
    public static int getIndexOfMax(int[] values)
    {
        Arrays.sort(values);
        int end = values.length - 1;
        return values[end];
    }
    
    // 7) Write a public static method named swapByIndex, 
    //    that takes three arguments. The first argument is an Array of int, 
    //    and the second and third arguments are int indexes. 
    //    This method will swap the values at the two given index arguments 
    //    in the array, and return a reference to the array.
    public static int[] swapByIndex(int[] values, int i, int j)
    {
        int temp = values[i];
        int temp1 = values[j];
        values[i] = temp1;
        values[j] = temp;
        return values;
    }
    
    //8) Write a public static method named removeAtIndex, 
    //  that takes two arguments. The first argument is an Array of int, 
    //  and the second argument is an int index. This method create and return 
    //  a new array with all of the values in the argument array 
    //  except the value at the argument index.
    public static int[] removeAtIndex(int[] values, int j)
    {
        int currentSize = values.length;
        int pos = j;
        for (int i = pos + 1; i < values.length; i++)
        {
            values[i - 1] = values[i];
        }
        currentSize--;
        int[] newValues = Arrays.copyOf(values, currentSize);
        return newValues;
    }
    
    //9) Write a public static method named insertAtIndex, 
    //   that takes three arguments. The first argument is an Array of int, 
    //   the second argument is an int index, and the third argument is an int value. 
    //   This method create and return a new array with all of the values 
    //   in the argument array and including the third argument value 
    //   inserted at the index specified by the second argument value.
    public static int[] insertAtIndex(int[] values, int j, int num)
    {
        int pos = j;
        int currentSize = values.length;
        int[] newValues = new int[currentSize + 1];
        for (int i = 0; i < values.length; i++)
        {
            newValues[i] = values[i];
        }
        if (currentSize < newValues.length)
        {
            currentSize++;
            for (int i = currentSize - 1; i > pos; i--)
            {
                newValues[i] = newValues[i-1];
            }
            newValues[pos] = num;
        }
        return newValues;
    }
    
    //10) Write a public static method named isSorted, 
    //    that takes an Array of int as an argument. 
    //    This method should return the boolean value true 
    //    if all the element values in the array are in ascending order; 
    //    otherwise the method should return the boolean value false.
    public static boolean isSorted(int[] values)
    {
        boolean sorted = true;
        for (int i = 1; i < values.length; i++)
        {
            if (values[i] < values[0])
            {
                sorted = false;
                break;
            }
            else
            {
                sorted = true;
            }
        }
        return sorted;
    }

}
