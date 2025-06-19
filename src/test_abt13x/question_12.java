package test_abt13x;
//Create a program to calculate factorial of a number using while loop.

import java.util.Scanner;

public class question_12 {
    public static void main(String[] args) {
        int num,fact=1;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if (num==0)
        {
            System.out.println("1");
            return;
        }

        while(num>0)
        {
            fact=fact* num;
            num--;
        }
        System.out.println(fact);
    }
}
