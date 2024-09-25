import java.util.*;

// Average of 3 numbers:-
public class problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = (a + b + c) / 3;
        System.out.println("Average is: " + average);

    }

}