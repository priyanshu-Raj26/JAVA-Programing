import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt(); 
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt(); 
        System.out.println("Enter operator: ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                     System.out.println(num1+num2);
                     break;
            case '-':
                     System.out.println(num1-num2);
                     break;
            case '*':
                     System.out.println(num1*num2);
                     break;
            case '/':
                     System.out.println(num1/num2);
                     break;
            case '%':
                     System.out.println(num1%num2);
                     break;
        
            default:System.out.println("Wrong operator");
                break;
        }
    }
}
