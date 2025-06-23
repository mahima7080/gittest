package Task_Abt13x.task_23_june;

import java.util.Scanner;

public class eligible_to_vote {
    public static void main(String[] args) {
        System.out.println("enter the age");
        int age;
        Scanner sc=new Scanner(System.in);
        if (!sc.hasNextInt())
        {
            System.out.println("enter digits only");
            return;
        }
        age=sc.nextInt();
       String result= age>18 ?"can vote": "not vote";
        System.out.println(result);
    }
}
