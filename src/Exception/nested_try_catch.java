package Exception;

import java.util.Scanner;

public class nested_try_catch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Outer risky operation
            System.out.print("Enter array size: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            try {
                // Inner risky operation
                System.out.print("Enter index to access: ");
                int index = sc.nextInt();
                System.out.println("Value at index " + index + ": " + arr[index]);

                int result = 10 / arr[index];  // Might throw ArithmeticException
                System.out.println("10 / arr[" + index + "] = " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Index is out of bounds.");
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero.");
            }

        } catch (NegativeArraySizeException e) {
            System.out.println("Outer catch: Array size can't be negative.");
        }

    }
}
