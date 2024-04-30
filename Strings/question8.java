
public class question8 {
    public static String replaceAll(String word, String oldW, String newW) {
        return word.replaceAll(oldW, newW);
    }

    public static void main(String[] args) {
        String word = "xxforxx xx for xx";
        String oldW = "xx";
        String newW = "Geeks";

        System.out.println(replaceAll(word, oldW, newW));
    }
}
