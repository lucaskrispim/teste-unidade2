package app.utils;

public class StringUtils {

    public static String reverse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    public static int countOccurrences(String str, char ch) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }
}
