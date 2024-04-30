
// Largest String
public class question2 {
    public static String LargestString(String[] animal) {
        String largest = animal[0];
        for (int i = 0; i <= animal.length; i++) {
            if (largest.compareTo(animal[i]) < 0) {
                largest = animal[i];
            }
        }
        return largest;
    }

    public static void main(int[] args) {
        String[] animal = { "lion", "zebra", "monkey" };
        System.out.println(LargestString(animal));
    }
}