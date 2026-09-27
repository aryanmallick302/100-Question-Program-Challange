public class Question_16 {
    public static void main(String[] args) {
        char element = 'a';
//        System.out.println(vowelIdentifier(element));
        if (vowelIdentifier(element)) {
            System.out.println("It is vowel");
        } else {
            System.out.println("It is consonant");
        }
    }

    public static boolean vowelIdentifier (char c) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

        for (char items: vowels) {
            if(items == c) {
                return true;
            }
        }

        return false;
    }
}
