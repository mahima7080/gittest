package Exception;

import java.util.Scanner;

public class throwss {

    public static void main(String[] args) {
        try {
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            input(n);
        }
        catch (ArithmeticException e)
        {
           // System.out.println(e.getMessage());
            System.out.println("cant be divided by zero");
        }
        finally {
            System.out.println("this will execute always");//It is used to clean up the resources like -
            // closing file,disconnecting database,releasing memory
        }
    }
   public  static void input(int num) throws  ArithmeticException
    {
        int reult= num/2;
        System.out.println(reult);
    }
}
