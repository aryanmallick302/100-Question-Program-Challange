public class Question_08 {
    public static void main(String[] args) {
        System.out.println(convertor(32));
    }

    static float convertor (float degree) {
        float farenheit = (degree * 9/5) + 32;

        return farenheit;
    }
}
