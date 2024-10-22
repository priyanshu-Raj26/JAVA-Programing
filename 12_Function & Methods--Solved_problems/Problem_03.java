// Write a Java program to check if a number is a palindrome in Java?

import java.util.*;

public class Problem_03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int mynum = num;
        if (mynum == palindrom(mynum)) {
            System.out.println(mynum+" Is a palindrom");
        }else {
            System.out.println(mynum+" Is not a palindrom");
        }
    
    }
    
    public static int palindrom(int num) {
        int s = 0;
        while (num > 0) {
            int n = num % 10;
            s = (s*10) + n;
            num = num/10;
        }
        return s;
    }
}

