//Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user
package Day1;
import java.lang.*;
import java.util.*;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum=0;

        while(n>0)
        {
            sum+=n;
            n--;

        }
        System.out.println(sum);

    }
}
