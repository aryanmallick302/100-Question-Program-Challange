public class Question_07 {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a after swap: " + a);
        System.out.println("Value of b after swap: " + b);
    }

}
