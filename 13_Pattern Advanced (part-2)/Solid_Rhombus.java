public class Solid_Rhombus {

    public static void pattern(int n) {

        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");               
            }
            //star
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        
        }
    }

     
    public static void main(String[] args) {
        pattern(5);
    }
}
