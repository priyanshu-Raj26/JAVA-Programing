import java.util.*;

public class print_num_from_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int n = sc.nextInt();
        while (counter <= n) {
            System.out.print(counter + "  ");
            counter++;
        }

    }
}