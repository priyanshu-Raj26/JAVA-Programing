import java.util.*;

public class Question_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("Enter your number: ");
            num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println("Number was: "+num);
        } while (true);
    }
}
