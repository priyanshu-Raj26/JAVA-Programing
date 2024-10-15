import java.util.*;

public class Prime_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("The number is not prime.");
            return;
        }

        boolean isprime = true;
        
        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }

        if (isprime) {
            System.out.println("The number is prime.");
        }else {
            System.out.println("The number not prime.");
        }
    }
}
