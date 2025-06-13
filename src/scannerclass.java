import java.util.Scanner;

public class scannerclass {

    /*
    you have declared variable outside the main func (without static keyword) you can access the var after creating object of class like this
    scannerclass s=new scannerclass();
    s.a
    s.b
    s.result

    otherwise you can create static variable(global) outside the function. you can access th var directly without creating
    object.
    static int a;
    * */
     int a ,b;
    int result;
    public static void main(String[] ar)
    {
scannerclass s=new scannerclass();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value of a");
        s.a=scanner.nextInt();
        System.out.println("enter the value of b");
        s.b=scanner.nextInt();
        s.result=s.a+s.b;
        System.out.println(s.result);
    }
}
