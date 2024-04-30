
import java.util.*;

public class reverseStr {
    public static String Reverse(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word To Reverse: ");
        String str = sc.next();
        String reversedStr = Reverse(str);
        System.out.println("Original String: " + str);
        System.out.println("Revesed String: " + reversedStr);
        sc.close();
    }
}