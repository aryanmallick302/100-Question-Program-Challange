public class Question_10 {
    public static void main(String[] args) {
        int second = 3600;
        secondConverter(second);
    }

    public static void secondConverter (int second) {
        int minute = second / 60;
        int hour = minute / 60;

        if (second > 60) {
            second = 0;
            minute += 1;

            if (minute > 60) {
                minute = 0;
                hour += 1;
            }
        }

        System.out.println(second + " is converted to hh:mm = " + hour + ":" + minute);
    }
}