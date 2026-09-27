public class Question_09 {
    public static void main(String[] args) {
        int[] marks = {76, 85, 97, 32, 54};
        totalAndAverage(marks);
    }

    static void totalAndAverage(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total = total + mark;
        }
        int average = total / marks.length;

        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
    }
}
