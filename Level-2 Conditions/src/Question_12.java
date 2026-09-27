public class Question_12 {
    public static void main(String[] args) {
        int num = -10;
        finder(num);
    }

    static void finder (int num) {
        if (num < 0) {
            System.out.println(num + " is negative number");
        } else if (num > 0) {
            System.out.println(num + " is positive number");
        } else {
            System.out.println(num + " is zero");
        }


    }
}
