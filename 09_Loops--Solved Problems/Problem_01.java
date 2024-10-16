import java.util.*;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int integer,even=0,odd=0;
        System.out.println("Enter any numbers: ");

         for (int i = 1; i <= 10; i++) {
            integer = sc.nextInt();
            if (integer % 2 == 0) {
                even += integer;
            } else {
                odd += integer;
            }
         }
         System.out.println("Sum of even integers is: "+ even);
         System.out.println("Sum of odd integers is: "+ odd);
    }
} 