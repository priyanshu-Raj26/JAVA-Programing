public class type_promotion_03 {
    public static void main(String[] args) {
        byte b = 5;
        // byte a = b * 2; // error: incompatible types: possible lossy conversion from int to byte
        byte a =(byte) (b * 2);
        System.out.println(a);

    }
}
