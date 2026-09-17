// WAP to read two numbers and print their sum

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Result = " + sumOfNumber(num1, num2));
        sc.close();
    }

    static int sumOfNumber (int num1, int num2){
        return num1 + num2;
    }
}
