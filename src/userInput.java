import java.util.Scanner;

public class userInput {

    public static void main(String[] args)
    {
        int num;
        System.out.println("enter the  number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if (num<0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("positive");
        }

    }
}
