public class Number_pyramid {

    public static void pattern(int n) {

        for (int i = 1; i <= n; i++) {
            
            //space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //num
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
