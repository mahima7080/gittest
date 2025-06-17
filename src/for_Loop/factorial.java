package for_Loop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
int num;
        System.out.println("enter number");
        Scanner scanner =new Scanner(System.in);
        if (!scanner.hasNextInt())
        {
            System.out.println("enter interger you fool");
            return;
        }
        num=scanner.nextInt();
        int fact=1;


        if (num==0||num==1)
        {
            System.out.println(fact);

        } else if (num<0) {
            System.out.println("negative no not allowed");

        } else {
        for(int i=num;i>0;i--)
        {
           fact= fact*i;
        }
      System.out.println(fact);
        }
    }
}
