import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        long num;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        if (!sc.hasNextLong())
        {
            System.out.println("enter interger no ");
            return;
        }
        num=sc.nextInt();
        sc.close();
        int count=0;

        for (int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            System.out.println("it is prime num"+ num);
        }
        else {
            System.out.println("not prime no"+ num);
        }
    }
}
