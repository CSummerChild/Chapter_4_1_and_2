import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomDoubleArray {
    public static void main(String[] args) {
        double[] array = new double[50];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble();
        }

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an index between 0 and 49: ");
            int index = scanner.nextInt();

            if (index >= 0 && index < array.length) {
                System.out.println("Value index is " + index + ": " + array[index]);
            } else {
                System.out.println("Index out of range.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please try again with a valid integer index.");
        } finally {
            scanner.close();
        }
    }
}
