public class Question_06 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}
