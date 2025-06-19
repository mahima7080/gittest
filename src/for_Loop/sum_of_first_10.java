package for_Loop;
//import static java.lang.Math.pow;

public class sum_of_first_10 {
    public static void main(String[] args) {
        int i,sum=0;
        for(i=1;i<=2;i++)
        {
            int p= (int) Math.pow(i,2);
            sum=sum+p;
        }
        System.out.println(sum);
        int min=Math.min(2,6);
        System.out.println(min);
        int x=Math.max(7,9);
        System.out.println(x);
        double s=Math.sqrt(144.34);//Math.sqrt() alwys take double, explicitly you can change
        System.out.println(s);
    }
}
