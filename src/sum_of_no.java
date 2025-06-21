import java.util.Scanner;

public class sum_of_no {
    public static void main(String[] args) {
        int n ,rem;int sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        while (n>0 )
        {
             rem=n%10;
             sum=sum+rem;
             n=n/10;
             if (sum>9 && n==0)
             {
                 n=sum;
                 sum=0;
             }


        }
        System.out.println(sum);

      /*  int s=0,r;
       if (sum>9)
       {
           while (sum>0)
           {
               r=sum%10;
              s=s+r;
               sum=sum/10;

           }
           System.out.println(s);
       }*/

    }
}
