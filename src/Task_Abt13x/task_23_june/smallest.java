package Task_Abt13x.task_23_june;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter the value of a and b");
        Scanner sc=new Scanner(System.in);
        if (!sc.hasNextInt())
        {
            System.out.println("enter interger only");
            return;
        }
        a=sc.nextInt();
        b=sc.nextInt();
        if (a<b)
        {
            System.out.println(a +" is smallest");
        }
        else {
            System.out.println(b+ "is smallest");
        }
    }
}
