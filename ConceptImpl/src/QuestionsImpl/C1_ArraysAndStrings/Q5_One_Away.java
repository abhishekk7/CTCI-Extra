package QuestionsImpl.C1_ArraysAndStrings;

/**
 * Created by Abhishek Kumar on 7/10/2017.
 */
public class Q5_One_Away {
    public static void main(String[] args) {
        System.out.println(isOneEditAway("pale", "ple"));
        System.out.println(isOneEditAway("pale", "pole"));
        System.out.println(isOneEditAway("pale", "plc"));
        System.out.println(isOneEditAway("ple", "pale"));
    }

    public static boolean isOneEditAway(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return oneReplace(s1, s2);
        } else if (s1.length() + 1 == s2.length()) {
            return oneInsert(s1, s2);
        } else if (s1.length() == s2.length() + 1) {
            return oneInsert(s2, s1);
        } else {
            return false;
        }
    }

    private static boolean oneInsert(String s1, String s2) {
        int i1 = 0;
        int i2 = 0;
        while (i1 < s1.length() && i2 < s2.length()) {
            if (s1.charAt(i1) != s2.charAt(i2)) {
                if (i1 != i2) {
                    return false;
                }
                i2++;
            } else {
                i1++;
                i2++;
            }
        }
        return true;
    }

    private static boolean oneReplace(String s1, String s2) {
        boolean found = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (found)
                    return false;
                found = true;
            }
        }
        return true;
    }
}
