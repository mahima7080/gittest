package Exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Input_mismatch {
    public static void main(String[] args) {
        try {
            System.out.println("enter integer");
            Scanner sc=new Scanner(System.in);
            int num =sc.nextInt();
            System.out.println();
        }catch (InputMismatchException e)
        { throw new InputMismatchException("only integer");//you can give  messgae as well.
        }
    }
}
