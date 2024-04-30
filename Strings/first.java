
import java.util.Scanner;

// Strings are immutable
// Next = single word
// NextLine = whole line
public class first {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("My Name is: " + name);
        System.out.println(name.length());
        sc.close();
    }
}
