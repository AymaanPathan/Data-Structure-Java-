
// Check Palindrome

public class question1 {
    public static boolean Palindrome(String word) {

        for (int i = 0; i < word.length() / 2; i++) {
            int n = word.length();
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "mon";
        System.out.println(Palindrome(word));
    }
}
