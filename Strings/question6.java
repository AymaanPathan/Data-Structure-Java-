
import java.util.Scanner;

// Check number of vowels

public class question6 {

    public static String vowels(String word) {
        Integer count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                count++;
            } else if (word.charAt(i) == 'e') {
                count++;
            } else if (word.charAt(i) == 'i') {
                count++;
            } else if (word.charAt(i) == 'o') {
                count++;
            } else if (word.charAt(i) == 'u') {
                count++;
            }
        }
        return count.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String word = sc.nextLine();
        System.out.println("Vowels in this word are: " + vowels(word));
        sc.close();
    }
}
