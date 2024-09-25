import java.util.*;

// Bill of items:-
public class problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float Cost = (float) (pencil + pen + eraser);
        System.out.println("Bill is: " + Cost);

        float Total  = (float) (Cost + (Cost * 0.18));
        System.out.println("Bill with 18% tax is: " + Total);
    }
}
