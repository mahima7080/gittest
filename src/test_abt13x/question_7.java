package test_abt13x;
// Create a program to find the largest of three numbers.
import java.util.Scanner;

public class question_7 {
    public static void main(String[] args)
    {
        int a,b,c;

        System.out.println("enter any 3 numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();



        int max= a>b? a: b>c?b:c;
        System.out.println("greatesr" + max);



    }
}
