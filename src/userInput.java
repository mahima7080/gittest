import java.util.Scanner;

public class userInput {

    public static void main(String[] args)
    {
        int num;
        //System.out.println("enter the  number");
        /*
        * take user input through edit configuration
        * you will get it before run button */
        num=Integer.parseInt(args[0]);

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
