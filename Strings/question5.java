
public class question5 {
    public static String Compression(String word) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < word.length(); i++) {
            Integer count = 1;
            while (i < word.length() - 1 && word.charAt(i) == word.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                sb.append(count);
            }
            sb.append(word.charAt(i));
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String word = "aabbccddd";
        System.out.println(Compression(word));
    }
}
