package QuestionsImpl.C1_ArraysAndStrings;

/**
 * Created by Abhishek Kumar on 7/10/2017.
 */
public class Q4_Palindrome_Permutation {
    public static void main(String[] args) {
        System.out.println(isPermutaionPalindrome("Tact Coa"));
    }

    public static boolean isPermutaionPalindrome(String input) {
        int[] freq = buildCharFrequency(input);
        return checkMaxOneOdd(freq);
    }

    private static boolean checkMaxOneOdd(int[] freq) {
        boolean foundOdd = false;
        for (int count : freq) {
            if (count % 2 == 1) {
                if (foundOdd)
                    return false;
                else
                    foundOdd = true;
            }
        }
        return true;
    }

    //helper functions
    public static int[] buildCharFrequency(String input) {
        int[] freq = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : input.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                freq[x]++;
            }
        }
        return freq;
    }

    private static int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        int val = Character.getNumericValue(c);

        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }
}
