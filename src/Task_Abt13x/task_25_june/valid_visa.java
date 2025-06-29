package Task_Abt13x.task_25_june;
/**
22)  Find if a Person Can Travel Based on Visa Status and Age.

     take the input from the user for

            Age (integer).

            Visa Status (String or boolean).

     Check Eligibility:

             :- If age is 18 or older and visa status is valid, the person can travel.

Otherwise, the person cannot travel.

        Validation Criteria

                Age: - Must be a non-negative integer.

                         :- Should be greater than or equal to 18 to be eligible to travel.

        Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").

                               :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.
 */
import java.util.Scanner;

public class valid_visa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String str = sc.next();
        boolean isvalid = false;
        if (str.equals("valid")) {
            isvalid = true;
        }
        if (age >= 18 && isvalid) {
System.out.println("allow to travel");
        }
        else {
            System.out.println("not allowed to travel");
        }
    }
}
