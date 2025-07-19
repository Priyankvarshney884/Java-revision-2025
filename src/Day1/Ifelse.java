//Mr. T got the Electricity bill of his house. He felt that the bill amount was too much. He come to you to understand the relation between amount and number of units with Electricity bill.
//
//
//Instructions are give on Electricity biil that :
//        1. For first 50 units Rs. 0.50/unit.
//2. For next 100 units Rs. 0.75/unit.
//3. For next 100 units Rs. 1.20/unit.
//4. For above 250 units Rs. 1.50/unit.
//5. An additional surcharge of 20% is added to the bill.
//



package Day1;
import java.lang.*;
import java.util.*;


public class Ifelse {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double bill =0;
        if (n <= 50) {
            bill = n * 0.50;
        } else if (n <= 150) {
            bill = (50 * 0.50) + ((n - 50) * 0.75);
        } else if (n <= 250) {
            bill = (50 * 0.50) + (100 * 0.75) + ((n - 150) * 1.20);
        } else {
            bill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((n - 250) * 1.50);
        }

        // Adding the surcharge of 20%
        bill = bill * 1.20;

        System.out.println((int)(bill));

    }
}
