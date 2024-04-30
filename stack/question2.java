public class question2 {
    static char[] ch;

    public static char[] print(String s) {
        for (int i = 0; i < s.length(); i++) {
            ch = s.toCharArray();
        }
        return ch;
    }

    public static void main(String[] args) {
        String s = "hello";
        print(s);
        System.out.println(ch);
    }
}
