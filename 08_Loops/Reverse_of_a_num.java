public class Reverse_of_a_num {
    public static void main(String[] args) {
        int num = 260204;
        int n,rev = 0;

        for(int i=0; num != 0; i++) {
            n = num % 10;
            rev = (rev*10) + n;   //System.out.print(n);
            num = num/10;
        }
        System.out.println("Reversed number is: "+rev);
    }
}
