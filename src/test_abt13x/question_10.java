package test_abt13x;

import java.util.Scanner;

public class question_10 {
    static int a=10,b=2,result;

    public static void main(String[] args)
    {
        String  s;

        System.out.println("enter addition/ subtraction/ multiplication/ division/ modulo");
        Scanner scanner= new Scanner(System.in);
        s= scanner.next();

        s=s.toLowerCase();


        switch (s){
            case "addition":
                result=a+b;
                System.out.println(result);
                break;
            case "subtraction":
                result=a-b;
                System.out.println(result);
                break;
            case "multiplication":
                result=a*b;
                System.out.println(result);
                break;
            case "division":
                result=a/b;
                System.out.println(result);
                break;
            case "modulo":

                result=a%b;
                System.out.println("result=" +result);
                break;
            default:
                System.out.println("invalid");
        }
    }
}
