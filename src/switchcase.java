import java.util.Scanner;

public class switchcase {

    public static void main(String[] arg)
    {int num;
        System.out.println("enter no");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int result=num%2;
        switch (result)
        {
            case 0:
                System.out.println(" it is even");
                break;
            case 1:
                System.out.println("it is odd");
                break;
            default:System.out.println(" not matching");
        }

    }
}
