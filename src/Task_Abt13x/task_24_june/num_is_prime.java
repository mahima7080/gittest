package Task_Abt13x.task_24_june;

import java.util.Scanner;

public class num_is_prime {
    public static void main(String[] args) {
        int num;
        System.out.println("enter number");
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        boolean is_prime=false;
        int count=0;
        for (int i=1;i<=num;i++)
        {
            if (num%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            System.out.println("prime no");
        }
        else {
            System.out.println("not a prime no");
        }
    }
}
