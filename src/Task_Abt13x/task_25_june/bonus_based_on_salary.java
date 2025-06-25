package Task_Abt13x.task_25_june;

import java.util.Scanner;

/**
Calculate Bonus Based on Salary and Years of Experience.

          :- take the salary and Year info from the User.

Implement Bonus Calculation Logic:

     Define the bonus structure based on salary and years of experience.

           :- If years of experience is less than 1 year: No bonus.

           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.

           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.

           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.


 */
public class bonus_based_on_salary {
    public static void main(String[] args) {
        int year;
        double salary;
        double bonus=0.0;
        System.out.println("enter experience in terms of year and salary");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        salary=sc.nextInt();
        if (year<1)
        {
            System.out.println(" no bonus");
        }
        else if (year>=1 && year <=3)
        {
            bonus=salary*0.05;
        }
        else if (year>=4 && year<=6)
        {
         bonus= salary*0.10;
        }
        else {
            bonus=salary*0.15;
        }

        System.out.println(bonus);
    }
}
