package QuestionsImpl.C1_ArraysAndStrings;

/**
 * Created by Abhishek Kumar on 7/6/2017.
 */
public class Q2_IsPermutation {
    public static boolean isPermutation(String one, String two) {
        if (one.length() != two.length()) return false;

        int[] letters = new int[128];
        for (int i = 0; i < one.length(); i++) {
            letters[one.charAt(i)]++;
        }

        for (int i = 0; i < two.length(); i++) {
            letters[two.charAt(i)]--;
            if (letters[two.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            System.out.println(pair[0] + ", " + pair[1] + " : " + isPermutation(pair[0], pair[1]));
        }
    }
}
