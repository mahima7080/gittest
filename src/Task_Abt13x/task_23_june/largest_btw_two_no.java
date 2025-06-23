package Task_Abt13x.task_23_june;

import java.util.Scanner;

public class largest_btw_two_no {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter the value of a and b");
        Scanner sc=new Scanner(System.in);
        if (!sc.hasNextInt())
        {
            System.out.println("enter only interger");
            return;
        }
        a=sc.nextInt();
        b=sc.nextInt();

        int result=a>b? a:b;
        System.out.println(result + "is greatest" );
    }
}
