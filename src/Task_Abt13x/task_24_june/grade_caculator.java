package Task_Abt13x.task_24_june;

import java.util.Scanner;
//grade calculator
public class grade_caculator {
    public static void main(String[] args) {
        int num;
        System.out.println("enter the number");
        String grade;
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        if (num>=90&&num<=100)
        {
            grade="+A";
        }
        else if (num>=80&&num<=89)
        {
            grade="A";
        }
        else if(num>=70&&num<=79)
        {
            grade="B";
        }
        else if(num>60&&num<=69)
        {
            grade="C";
        }
        else if(num>=50&&num<=59)
        {
            grade="D";
        }
        else if (num>=40&&num<=49)
        {
            grade="E";
        }
        else
        {
            grade="fail";
        }

        System.out.println(grade);

    }
}
