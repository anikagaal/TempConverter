import java.util.Scanner;

public class User {

    private static Scanner keyboard = new Scanner(System.in);

    private User() {} // prevent instantiation

    public static double inputDouble() {
        boolean isInputBad = true;
        boolean hasNextDouble;
        double value = 0.0;
        while (isInputBad) {
            hasNextDouble = keyboard.hasNextDouble();
            if (hasNextDouble) {
                value = keyboard.nextDouble();
                isInputBad = false;
            } else {
                System.out.print("Invalid input. Enter a number: ");
            }
            keyboard.nextLine();
        }
        return value;
    }

    public static double inputDouble(String message) {
        System.out.printf("%s", message);
        double value = inputDouble();
        return value;
    }
}
