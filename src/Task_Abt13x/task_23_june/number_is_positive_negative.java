package Task_Abt13x.task_23_june;

import java.util.Scanner;

public class number_is_positive_negative {
    public static void main(String[] args) {
        int num;
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        if (!sc.hasNextInt())
        {
            System.out.println("only interger number is allowed");
            return;
        }
        num=sc.nextInt();
        if (num>0)
        {
            System.out.println("positive");
        }
        else if (num<0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("number is 0");
        }

    }
}
