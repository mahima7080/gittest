package concepts;

import java.util.Scanner;
public class even_odd_m_to_n {
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int count_even=0;
        int count_odd=0;
        even_odd_m_to_n obj=new even_odd_m_to_n();
        obj.even_odd_checker(m,n,count_even,count_odd);


   }
  void even_odd_checker(int m,int n,int e,int o)
    {
        for (int i=m;i<=n;i++)
        {
            if (i%2==0)
            {
                // System.out.println(i+" is a even no");
                e++;
            }
            else {
                //System.out.println(i+ "is not prime no");
                o++;
            }
        }
        System.out.println(e);
        System.out.println(o);
    }
}




