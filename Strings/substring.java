
public class substring {
    public static String Substring(String word, int firstIndex, int lastIndex) {
        String str = "";
        for (int i = firstIndex; i < lastIndex; i++) {
            str += word.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {
        String word = "hello";
        System.out.println(Substring(word, 0, 2));
    }
}
