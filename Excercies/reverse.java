import java.util.Arrays;

public class reverse {
    public static void reverseString(char[] s) {
       for(int start=0,end=s.length-1;start<=end;start++,end--){
        char temp = s[start];
        s[start] =s[end];
        s[end] = temp;
       }
    }

    public static void main(String[] args) {
        char[] s =  {'h','e','l','l','o'};
        reverseString(s);
    System.out.println(Arrays.toString(s));
    }
}
