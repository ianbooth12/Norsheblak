/*-------------------------------------------------------------
//AUTHOR: your name.
//FILENAME: title of the source file.
//SPECIFICATION: your own description of the program.
//FOR: CSE 110 - Lab #10
//TIME SPENT: how long it took you to complete the assignment.
//-----------------------------------------------------------*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab10
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        /* Create an array of Student */
        final int NUM_STUDENTS = 10;
        Student10[] gradebook = new Student10[NUM_STUDENTS];

        

        /* Read the input file and add new records into the Student array */

        BufferedReader br = new BufferedReader(new FileReader("lab10_student_data.txt"));
        String contentLine = br.readLine();
        int lineCount = 0;

        while (contentLine != null)
        {
            String[] rawInput = contentLine.split(",");
            gradebook[lineCount] = new Student10(rawInput[0], rawInput[1], Double.parseDouble(rawInput[2]));
            lineCount++;
            contentLine = br.readLine();
        }

        for (int i = 0; i < gradebook.length; i++)
        {
            System.out.println("Read #" + (i+1) + ":" + gradebook[i].toString());
        }
        /* Find out duplicate student records by .equals() */
        for (int i = 0; i < NUM_STUDENTS; i++)
        {
            for (int j = i + 1; j < NUM_STUDENTS; j++)
            {
                if (gradebook[i].equals(gradebook[j]))
                {
                    System.out.printf("\"%s\" and \"%s\": %s\n",
                            gradebook[i].getFullName(), gradebook[j].getFullName(), gradebook[i].getId());
                }
            }
        }
    }
}
