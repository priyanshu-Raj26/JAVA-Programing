public class type_promotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);  // both a & b become integer 

        // char c = a - b; // error: incompatible types: possible lossy conversion from int to char
        // a & b  abb integer ban chuka h and 'c' char h ,so error occurs

        
    }
}
