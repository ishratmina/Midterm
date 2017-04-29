package math;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number whose factorial is to be found: ");
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 1; i<n+1; i++) {
            result = result*i;
            if (i!=n)
            System.out.println(i + "x");
            else System.out.println(i+ "=" + result);

        }
    }

}