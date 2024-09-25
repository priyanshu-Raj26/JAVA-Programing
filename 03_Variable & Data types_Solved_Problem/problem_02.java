import java.util.Scanner;


// Area of a square:-
public class problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();
        int area = side * side;

        System.out.println("Area of the  is: "+area);
    }
}
