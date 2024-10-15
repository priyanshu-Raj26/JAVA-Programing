public class Continue {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;  //escape odd no.
            }
            System.out.println(i);  // print even  no only.
        }
    }
}
