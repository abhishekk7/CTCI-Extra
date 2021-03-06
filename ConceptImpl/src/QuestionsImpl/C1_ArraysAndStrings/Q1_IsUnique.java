package QuestionsImpl.C1_ArraysAndStrings;

/**
 * Created by Abhishek Kumar on 7/6/2017.
 */
public class Q1_IsUnique {
    public static boolean hasUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + " " + hasUniqueChars(word));
        }
    }
}
