// Write a Java method to compute the sum of the digits in an integer.

import java.util.*;

public class problem_05 {

    public static int sum(int num) {
        int s = 0;

        num = Math.abs(num); // Make sure to handle negative numbers

        while (num !=0) {
            int n = num % 10;
            s += n;
            num /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Sum of the digit is: "+ sum(num));
    }
}
