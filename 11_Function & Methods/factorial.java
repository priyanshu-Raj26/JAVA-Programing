public class factorial {

    public static int fact(int fact) {
        int n = 1;
        for (int i = 1; i <= fact; i++) {
             n *= i;
        }
        return n;
    }
    public static void main(String[] args) {

        System.out.println("factorial of a number is: "+ fact(4));
    }
}
