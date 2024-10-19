import java.util.*;

public class product_of_num {

    public static int product(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
      
        System.out.println("Product is: "+ product(a,b));
    }

    
}