package test_abt13x;
//Write a program to print multiplication table using nested loops.
import java.util.Scanner;

public class question_13 {
    public static void main(String[] args) {
        int num;
        System.out.println("enter the num");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        for(int i =1;i<=10;i++)
        {
            int result=num*i;
            System.out.println(num + "*" + i + "=" + result);
        }
    }
}
