
public class StringBuilderCode {
    public static void main(String[] args) {
        String word = "deed";
        int start = 0;
        int end = word.length() - 1;
        if (word.isEmpty()) {
            System.out.println("Please Enter a Word!");
        }
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                System.out.println(word + " " + "is not a palindrome");
                break;
            }
            start++;
            end--;
            System.out.println(word + " " + "is a palindrome");
            break;
        }
    }
}
