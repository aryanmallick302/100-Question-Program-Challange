public class oddEvenFinder {
    public static void main(String[] args) {
        int num = 3/2;
        if(find(num)) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
    }

    static boolean find(int num) {
        if (num %2 == 0) {
            return true;
        }

        return false;
    }
}
