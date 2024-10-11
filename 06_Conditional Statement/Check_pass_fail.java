import java.util.*;

public class Check_pass_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

        String result = marks>=33 ? "You are Pass" : "You are fail";
        System.out.println(result);
    }
}
