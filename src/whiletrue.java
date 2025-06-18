import java.util.Scanner;

public class whiletrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number (0 to stop): ");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("Exiting the loop.");
                break; // This stops the loop
            }

            System.out.println("You entered: " + num);
        }
    }
}
