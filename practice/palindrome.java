public class palindrome {
    public static boolean isPalindrome(String word) {
     int start =0;
     int end = word.length()-1;
     while (start<end) {
        if(word.charAt(start)!=word.charAt(end)){
            return false;
        }
        start++;
        end--;
     }
     return true;
    }
    public static void main(String[] args) {
        String word = "wow";
        System.out.println(isPalindrome(word));
    }
}
