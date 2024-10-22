// Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise

import java.util.*;

public class Problem_02 {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt(); 
        System.out.println("is the number even? "+isEven(num));
    }
}
