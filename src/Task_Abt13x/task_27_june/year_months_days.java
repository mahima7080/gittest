package Task_Abt13x.task_27_june;

import java.util.Scanner;

/**
Convert Days into Years, Months, and Days.

       :- Take the Days Input from the User

    Define the conversion logic:

        :- Assume 1 year = 365 days.

        :- Assume 1 month = 30 days

        :- Convert the Days into Years, Month and days and Print it.

if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.
 */
public class year_months_days {

    public static void main(String[] args) {
        System.out.println("enter the no of days");
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int year=days/365;
        int remaining_days=days%365;
        System.out.println(year);
        System.out.println(remaining_days);
        int month=remaining_days/30;
        System.out.println(month);
        int remaining=remaining_days%30;
        System.out.println(remaining);
        System.out.println(year+"year"+","+ month+"month"+","+ remaining+"days");
    }
}
