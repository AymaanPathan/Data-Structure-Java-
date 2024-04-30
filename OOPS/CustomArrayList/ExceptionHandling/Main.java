package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(divide(2, 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Always  Execute");
        }

    }

    public static int divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Please dont divide by 0");
        }
        return num1 / num2;

    }
}
