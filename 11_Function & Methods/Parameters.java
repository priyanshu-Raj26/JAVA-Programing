import java.util.*;

public class Parameters {

    public static int calculateSum(int num1,int num2) {  // parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b); // Arguments or actual parameters
        System.out.println("Sum is: "+sum);

    }
}