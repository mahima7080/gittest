package test_abt13x;

import java.util.Scanner;

public class question_6 {
    public static void main(String[] args) {
        int num;
        System.out.println("enter any no");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num>0)
        {
            System.out.println("postive");
        }
        else if (num<0)
        {
            System.out.println("negative");
        }
        else {
            System.out.println("zero");
        }
    }
}
