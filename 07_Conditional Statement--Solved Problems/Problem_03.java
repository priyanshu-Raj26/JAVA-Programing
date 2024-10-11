import java.util.*;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weak number (1-7): ");
        int weak = sc.nextInt();

        switch (weak) {
            case 1:
                System.out.println("Monday.");
                break;
            case 2:
                System.out.println("Tuesday.");
                break;
            case 3:
                System.out.println("Wednesday.");
                break;
            case 4:
                System.out.println("Thrusday.");
                break;
            case 5:
                System.out.println("Friday.");
                break;
            case 6:
                System.out.println("Saturday.");
                break;
            case 7:
                System.out.println("Sunday.");
                break;
        
            default:  System.out.println("Invalid input! Please enter week number between (1-7).");
                break;
        }
    }
}
