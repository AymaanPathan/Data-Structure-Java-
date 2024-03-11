
public class practice {
    public static boolean isPalindrome(String s) {
        String Str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = Str.length() - 1;
        while (start <= end) {
            if (Str.charAt(start) != Str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("  "));
    }
}
