public class Binomial_Coefficent {

    public static int fact(int fact) {
        int n = 1;
        for (int i = 1; i <= fact; i++) {
             n *= i;
        }
        return n;
    }

    public static int bin_coeff(int n, int r) {
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r);

        int BC = n_fact/(r_fact*nmr_fact);
        return BC;
    }


    public static void main(String[] args) {

        System.out.println(bin_coeff(5, 2));
    }
}



