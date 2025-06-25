package Task_Abt13x.task_24_june;

import java.util.Scanner;

public class checking_triangle {
    public static void main(String[] args) {
        int side1,side2,side3;
        System.out.println("enter all three sides");
        Scanner sc=new Scanner(System.in);
        side1=sc.nextInt();
        side2=sc.nextInt();
        side3=sc.nextInt();
        if (side1==side2 && side2==side3)
        {
            System.out.println("equileteral tringle");
        }
        else if (side1==side2 || side2==side3|| side3==side1)
        {
            System.out.println("isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }
    }
}
