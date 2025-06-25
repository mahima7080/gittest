import java.util.Scanner;

public class Switch_calculator {
   static float a,b,result;

    public static void main(String[] args)
    {
        String  s;

System.out.println("enter addition/ subtraction/ multiplication/ division/ modulo");
        Scanner scanner= new Scanner(System.in);
        s= scanner.next();
        a=scanner.nextFloat();
        b=scanner.nextFloat();


        //  System.out.println(s);
       s=s.toLowerCase();
    //   System.out.println(s);
      /* if(s.equals("modulo"))
       {
           System.out.println("yes");
       }
       else
       {
           System.out.println("no");
       }*/

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
