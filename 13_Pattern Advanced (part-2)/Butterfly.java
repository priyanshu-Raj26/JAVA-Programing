public class Butterfly {

    public static void pattern(int n) {

        for (int i = 1; i <= n; i++) {
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void pattern_2(int n) {

        for (int i = n; i >= 1; i--) {
            //star
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            //space
            for (int j = 2*(n-i); j >= 1; j--) {
                System.out.print(" ");
            }
            //star
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
        pattern_2(4);
    }
}
