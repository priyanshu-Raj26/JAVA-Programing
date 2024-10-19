public class Call_by_Value {

    public static void swap(int a, int b) {
        // swap 
        int temp = a;
        a = b; 
        b = a;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a,b);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
