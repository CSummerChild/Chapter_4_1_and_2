import java.util.InputMismatchException;
import java.util.Scanner;

public class AdditionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second integer: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}
