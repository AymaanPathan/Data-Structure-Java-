
import java.util.*;

public class question7 {
    public static String isAnagram(String s1, String s2) {
        s1.toLowerCase();
        s2.toLowerCase();

        if (s1.length() == s2.length()) {
            char[] str1 = s1.toCharArray();
            char[] str2 = s2.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);

            boolean result = Arrays.equals(str1, str2);
            if (result) {
                return "YES";
            } else {
                return "NO";
            }
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        System.out.println(isAnagram(s1, s2));

    }
}
