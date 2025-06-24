package Task_Abt13x.task_24_june;
import java.util.Scanner;
/**
Initialize the account balance with a fixed amount (e.g., ₹10,000).
        2️⃣ Take user input for the amount they want to withdraw.
        3️⃣ Check withdrawal conditions:

The amount should be greater than zero.
The amount should be a multiple of 100 (common ATM rule).
The amount should not exceed the account balance.
        4️⃣ Deduct the amount from the balance if conditions are met.
5️⃣ Display the updated balance or an error message if the withdrawal fails.*/


public class Atm_withdrawal {
    public static void main(String[] args) {
        int Account_bal=10000;
        int money_to_withdrawal;
        int remaining_bal;
        Scanner sc=new Scanner(System.in);
        money_to_withdrawal=sc.nextInt();
        if((money_to_withdrawal>0 && money_to_withdrawal%100==0) &&money_to_withdrawal<Account_bal)
        {
             remaining_bal=Account_bal-money_to_withdrawal;
            System.out.println(remaining_bal);
        }
        else
        {
            System.out.println("money can't be withdrawn as per Atm rule");
        }

    }
}
