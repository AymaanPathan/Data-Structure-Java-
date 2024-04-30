public class first {
    public static void main(String[] args) {
        String str1 = "baseball";
        // String str2 = "baseball";
        String str3 = new String("baseball");
        // System.out.println(str1==str2); //True
        // System.out.println(str1==str3); //False
        String str4 = str3.intern();
        System.out.println(str1 == str4); // True

    }
}
