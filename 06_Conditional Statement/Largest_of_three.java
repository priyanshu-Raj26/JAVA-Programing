public class Largest_of_three {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        int num3 = 30;

        if (num1>=num2 && num1>=num3) {
            System.out.println("Largest number is num1: "+num1);
        }
        else if (num2>=num3) {
            System.out.println("Largest number is num2: "+num2);
        }
        else {
            System.out.println("Largest number is num3: "+num3);
        }

    }
}
