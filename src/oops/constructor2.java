package oops;

import java.util.Scanner;

class multiplication{
     int num;

    void input()
    {
        System.out.println("enter the value of num");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
    }


    void display()
    {
        for (int i =1;i<=10;i++)
        {
           int result=num*i;
            System.out.println(num+"*"+i+"="+result);
        }
    }


}

public class constructor2 {
    public static void main(String[] args) {
        multiplication mul=new multiplication();
        mul.input();
        mul.display();

    }
}
