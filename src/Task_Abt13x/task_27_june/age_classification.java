package Task_Abt13x.task_27_june;

import java.util.Scanner;

public class age_classification {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=0 && age<=12)
        {
            System.out.println("child");
        }
        else if(age>=13 && age<=19)
        {
            System.out.println("teenager");
        }
        else if(age>=20 && age<=64)
        {
            System.out.println("adult");
        }
        else {
            System.out.println("senior citizen or older");
        }
    }
}
