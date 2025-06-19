package test_abt13x;

import java.util.Scanner;

public class question_9 {
    public static void main(String[] args) {
int day_no;

        System.out.println("enter no 1 for sunday , 2 for monday , 3=tuesday , 4 for wedenesday , 5 for thursday , 6 for friday, 7 for saturday");

        Scanner sc=new Scanner(System.in);
        day_no=sc.nextInt();
        switch (day_no)
        {
            case 1:
            {
                System.out.println(" sunday");
                break;
            }
            case 2:
            {
                System.out.println(" monday");
                break;
            }
            case 3:
            {
                System.out.println(" tuesday");
                break;
            }
            case 4:
            {
                System.out.println(" wednesday");
                break;
            }
            case 5:
            {
                System.out.println(" thursday");
                break;
            }
            case 6:
            {
                System.out.println(" friday");
                break;
            }
            case 7:
            {
                System.out.println(" saturday");
                break;
            }
            default:
                System.out.println("invalid no");
                break;
        }
    }
}
