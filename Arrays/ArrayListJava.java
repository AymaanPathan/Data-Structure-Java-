import java.util.ArrayList;
import java.util.*;

public class ArrayListJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       ArrayList<Integer> list = new ArrayList<>(5);
    //    list.add(1);
    //    list.add(1);
    //    list.add(1);
    //    list.add(1);
    //    list.add(1);
    //    list.add(1);
    //    list.add(1);
    //    list.add(1);

    //    System.out.println(list);

       for(int i=0;i<=5;i++){
        list.add(sc.nextInt());
       }
       System.out.println(list);
       sc.close();
    }
}
