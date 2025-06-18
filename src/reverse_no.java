import java.util.Scanner;

public class reverse_no {
    public static void main(String[] args) {
        int num,rev=0;
        System.out.println("enter no");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        while (num>0){
            int rem=num%10;
            rev =rev*10+rem;
            num=num/10;

        }
        System.out.println(rev);

    }
}
