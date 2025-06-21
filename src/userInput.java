import java.util.Scanner;

public class userInput {

    public static void main(String[] args)
    {
        int num;
        //System.out.println("enter the  number");
        /*
        * take user input through edit configuration
        * you will get it before run button */

        num=Integer.parseInt(args[1]);

        if (num<0)
        {
            System.out.println(num+ "negative");
        }
        else
        {
            System.out.println(num+"positive");
        }

    }
}
