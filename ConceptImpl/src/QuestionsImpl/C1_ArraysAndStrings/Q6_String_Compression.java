package QuestionsImpl.C1_ArraysAndStrings;

/**
 * Created by Abhishek Kumar on 7/10/2017.
 */
public class Q6_String_Compression {

    public static void main(String[] args) {
        System.out.println(compress("aabbccdddddsssaaa"));
        System.out.println(compress("abc"));
        System.out.println(compress("abccccc"));
    }

    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append("" + str.charAt(i) + count);
                count = 0;
            }
        }
        if (str.length() > compressed.length()) {
            return compressed.toString();
        } else {
            return str;
        }
    }
}
