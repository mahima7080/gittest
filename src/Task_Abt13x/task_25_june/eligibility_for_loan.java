package Task_Abt13x.task_25_june;

import java.util.Scanner;

/**
Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)

    * Take the below User info and store it into the variables:

Age (integer)

Salary (double or float)

Credit Score (integer)

Age Validation:

        :- Check if the age is a positive integer.

        :- Ensure the age is at least 18 years old.

        :- Max age can be 80.



Salary Validation:

        :- Check if the salary is a positive number.

        :- Define a minimum salary threshold (e.g., 30,000).

Credit Score Validation:

        :- Check if the credit score is a positive integer.

             :- Define a minimum credit score threshold (e.g., 650).

        :- Max credit score threshold (e.g., 850).*/


public class eligibility_for_loan {
    public static void main(String[] args) {

        System.out.println("enter age , salary, and credit card_score");
        int age;
        double salary;
        int credit_score;
        Scanner sc=new Scanner(System.in);
       age= sc.nextInt();
       salary= sc.nextDouble();
       credit_score =sc.nextInt();

       boolean age_valid= (age>=18 && age<=80);
       boolean salary_validation=(salary>30000);
       boolean credid_validation= (credit_score>=650 && credit_score<=850);

       if (age_valid && (salary_validation && credid_validation))
       {
           System.out.println("eligible for loan");

       }
       else
       {
           System.out.println("not eligible for loan");
       }
    }

}
