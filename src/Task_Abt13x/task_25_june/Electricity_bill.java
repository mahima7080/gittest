package Task_Abt13x.task_25_june;

import java.util.Scanner;

/**
Electricity Bill Calculation (Based on Units Consumed)

           :- take the input from the user of Units.

Implement Rate Structure:

Define the rate structure for calculating the bill based on the number of units consumed.

        :-  First 100 units: 0.50Rs per unit

            :-  Next 100 units (101-200): 0.75Rs per unit

            :- Next 100 units (201-300): 1.20Rs per unit

            :- Above 300 units: 1.50Rs per unit
*/


public class Electricity_bill {
    public static void main(String[] args) {
        int unit;
        double bill=0.0;
        System.out.println("enter no");
        Scanner sc=new Scanner(System.in);
        unit=sc.nextInt();
        if (unit>=0 && unit<=100)
        {
            bill=unit*0.50;
        }
        else if (unit>=101 && unit<=200)
        {
            bill=unit*0.75;
        }
        else if (unit>=201 && unit<=300)
        {
            bill=unit*1.20;

        }
        else
        {
            bill=unit*1.50;
        }
        System.out.println(bill);
    }
}
