//Write a Java method to compute the average of three numbers..


import java.util.*;

public class Problem_01 {

    public static int average(int a,int b,int c) {
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
       System.out.println("Average is: "+average(a, b, c)); 
    }
}