import java.util.*;

public class Income_Tax_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();
        if (income < 500000) {
            System.out.println("Your tax is = 0");
        } else if (income >= 500000 && income <= 1000000) {
            System.out.println("Your tax is = "+income *(0.20));
        } else {
            System.out.println("Your tax is = "+income *(0.30));
        }
    }
}
