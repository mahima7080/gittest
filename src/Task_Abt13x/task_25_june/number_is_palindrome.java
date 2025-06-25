package Task_Abt13x.task_25_june;

import java.util.Scanner;

public class number_is_palindrome {
    public static void main(String[] args) {
        int num,reverse=0;
        System.out.println("enter no");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();


      int  number=num;
        while (num>0)
        {
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }

        if (number==reverse)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
