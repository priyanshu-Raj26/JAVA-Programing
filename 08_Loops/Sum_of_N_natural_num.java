import java.util.*;

public class Sum_of_N_natural_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1,sum = 0;
        int range = sc.nextInt();
        while (i <= range) {
           sum += i;
           i++;
        }

        System.out.println("Sum of first "+ range +" natural number is: " + sum);
    }
}
