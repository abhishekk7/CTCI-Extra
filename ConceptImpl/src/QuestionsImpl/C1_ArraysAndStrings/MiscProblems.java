package QuestionsImpl.C1_ArraysAndStrings;

import java.util.HashMap;

/**
 * Created by Abhishek Kumar on 7/8/2017.
 * <p>
 * firstNonRepeated(String str)
 * removeChars(String source, String remove)
 * reverseWords(String str)
 * strToInt(String str)
 */
public class MiscProblems {

    public static void main(String[] args) {
        System.out.println("firstNonRepeated : " + firstNonRepeated("aasdssfghdggkkh"));
        System.out.println("removeChars : " + removeChars("hi this is abhishek kumar", "aeiou"));
        System.out.println("reverseWords : " + reverseWords("Hi my name is Abhishek Kumar"));

        System.out.println("strToInt : " + (strToInt("84756") + 1));
        System.out.println("intToString : " + (intToString(-9932) + 1));
    }

    public static Character firstNonRepeated(String str) {
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
        char[] strArr = str.toCharArray();

        for (Character c : strArr) {
            if (countMap.containsKey(c)) {
                int value = countMap.get(c);
                countMap.put(c, value + 1);
            } else {
                countMap.put(c, 1);
            }
        }

        for (Character c : strArr) {
            if (countMap.get(c) == 1)
                return c;
        }
        return null;
    }

    public static String removeChars(String source, String remove) {
        char[] s_arr = source.toCharArray();
        char[] r_arr = remove.toCharArray();
        int index = 0;
        boolean[] flags = new boolean[128];

        for (char c : r_arr) {
            flags[c] = true;
        }

        for (char c : s_arr) {
            if (!flags[c]) {
                s_arr[index] = c;
                index++;
            }
        }
        return new String(s_arr, 0, index);
    }

    public static String reverseWords(String str) {
        StringBuilder temp = new StringBuilder("");
        int length, readPos, wordStart, wordEnd = 0;
        length = str.length();
        readPos = length - 1;
        while (readPos >= 0) {
            if (str.charAt(readPos) == ' ') {
                temp.append(str.charAt(readPos--));
            } else {
                wordEnd = readPos;
                while (readPos >= 0 && str.charAt(readPos) != ' ') {
                    readPos--;
                }
                wordStart = readPos + 1;
                while (wordStart <= wordEnd) {
                    temp.append(str.charAt(wordStart++));
                }
            }
        }
        str = temp.toString();
        return str;
    }

    public static int strToInt(String str) {
        int num = 0, i = 0;
        int length = str.length();
        boolean isNeg = false;
        if (str.charAt(i) == '-') {
            isNeg = true;
            i = 1;
        }
        while (i < length) {
            num = num * 10;
            num = num + str.charAt(i++) - '0';
        }
        if (isNeg) {
            num = -num;
        }
        return num;
    }

    public static String intToString(int num) {
        char[] temp = new char[11]; //Max length of the number is assumed to be 10 + 1 for the sign if negative
        int i = 0;
        boolean isNeg = false;
        if (num < 0) {
            num = -num;
            isNeg = true;
        }
        while (num > 0) {
            temp[i++] = (char) ((num % 10) + '0');
            num = num / 10;
        }

        StringBuilder stringBuilder = new StringBuilder();
        if (isNeg) {
            stringBuilder.append('-');
        }
        while (i > 0) {
            stringBuilder.append(temp[--i]);
        }
        return stringBuilder.toString();
    }
}
