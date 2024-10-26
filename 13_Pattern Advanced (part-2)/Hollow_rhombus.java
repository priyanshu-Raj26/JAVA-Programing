public class Hollow_rhombus {

    public static void hollow_rhombus(int totrows, int totclos) {

        
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totrows-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= totclos; j++) {
                if (i==1 || i == totrows || j == 1 || j == totclos) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }


    public static void main(String[] args) {
        hollow_rhombus(5, 5);
    }
}
