package comparing;

public class Main {
    public static void main(String[] args) {
        Student aymaan = new Student(545, 98);
        Student bob = new Student(546, 92);

        if (aymaan.marks > bob.marks) {
            System.out.println("Aymaan marks is more");
        } else {
            System.out.println("bob marks is more");
        }
    }
}
