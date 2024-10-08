public class unary_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        // pre increment:-
        System.out.println(a);
        System.out.println(b);
        
        
        int A = 10;
        int B = a++;
        // post increment:-
        System.out.println(A);
        System.out.println(B);
        
        
        
        int x = 10;
        int y = --x;
        // pre decrement:-
        System.out.println(x);
        System.out.println(y);
        
        
        int X = 10;
        int Y = X--;
        // post decrement:-
        System.out.println(X);
        System.out.println(Y);
    }
}
