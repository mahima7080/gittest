package Task_Abt13x.task_23_june;

import java.util.Scanner;

public class no_even_odd {
    public static void main(String[] args) {
        int num;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        if (!sc.hasNextInt())
        {
            System.out.println("enter integer only");
            return;
        }
       num= sc.nextInt();
       if (num%2==0)
       {
           System.out.println("number is even");
       }
       else
       {
           System.out.println("number is odd");
       }
    }
}
