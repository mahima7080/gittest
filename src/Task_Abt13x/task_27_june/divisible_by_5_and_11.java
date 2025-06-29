package Task_Abt13x.task_27_june;

import concepts.Scanner_class;
//Check if a Number is Divisible by 5 and 11
import java.util.Scanner;

public class divisible_by_5_and_11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0&& n%11==0)
        {
            System.out.println("number is divisible by 5 and 11");
        }
        else {
            System.out.println("number  is not divisible by 5 and 11 ");
        }
    }
}
