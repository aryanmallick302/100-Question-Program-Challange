// Write a program to read two numbers and print their sum, difference, product and
// quotient.

import java.util.Arrays;

public class Question_03 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(operation(-98)));
    }

    static int[] operation(int num){
        int sum = 0;
        int difference = 0;
        int product = 1;
        int quotient = 0;

        int[] array = new int[4];

        quotient = num / 10;
        while (num != 0){
            int temp = num % 10;
            num = num / 10;
            sum = sum + temp;
            product = product * temp;
        }

//        while (num != 0) {
//            int temp = num % 10;
//        }

        array[0] = sum;
        array[1] = difference;
        array[2] = product;
        array[3] = quotient;
        return array;
    }
}
