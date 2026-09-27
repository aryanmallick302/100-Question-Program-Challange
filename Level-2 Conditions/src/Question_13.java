public class Question_13 {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = -12;
        int num3 = 39;

        int greatest = greatestNumber(num1, num2, num3);

        System.out.println("Greatest Number is = " + greatest);
    }

    static int greatestNumber (int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else if (num3 > num1 && num3 > num2) {
            return num3;
        }

        return 0;
    }
}
