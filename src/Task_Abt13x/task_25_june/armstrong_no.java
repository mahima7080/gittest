package Task_Abt13x.task_25_june;

import java.util.Scanner;

public class armstrong_no {
    public static void main(String[] args) {
        int num;
        double sum=0.0;
        System.out.println("enter no");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int  number=num;
        while (num>0)
        {
            int rem=num%10;
            sum= sum+Math.pow((double) rem,(double)3);
            num=num/10;

        }
        System.out.println((int)sum);
        if (number==sum)
        {
            System.out.println("Armstrong no");
        }
        else
        {
            System.out.println("not ArmsStrong no");
        }
    }
}
