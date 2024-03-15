package Function;
import java.util.*;
public class javafunc {
    public static void printMyName(String myName){
        System.out.println(myName);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name Plzz");
        String name =  sc.next();
        printMyName(name);
        sc.close();
    }
}
