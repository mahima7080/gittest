package test_abt13x;
// Write a program to check if a year is a leap year.
import java.util.Scanner;

public class question_8 {
    public static void main(String[] args) {
        int year;
        System.out.println("enter year");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(((year%4==0 )&& (year%100!=0) )|| (year%400==0))
        {
            System.out.println("leap year");
        }
        else {
            System.out.println(" not a leap year");
        }


    }
}
