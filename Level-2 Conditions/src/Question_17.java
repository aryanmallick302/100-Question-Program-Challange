import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a single character: ");
        String inc = input.next();
        char c = 3;

        characterIdentification(inc.charAt(0));

    }

    public static void characterIdentification (char c) {
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z'};

        char[] symbol = new char[]{'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
        char[] number = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        for (char val : alphabet){
            if (c == val) {
                System.out.println(c + " is alphabet");
            }
        }

        for (char val : symbol){
            if (c == val) {
                System.out.println(c + " is symbol");
            }
        }

        for(char val : number) {
            if (c == val) {
                System.out.println(c + " is number");
            }
        }
    }
}
