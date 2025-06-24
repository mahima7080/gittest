package Task_Abt13x.task_24_june;
/// leap year or not
import java.util.Scanner;

public class leap_year_or_not {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        boolean is_leap_year=false;
        if ((year%4==0 && year!=100) || year%400==0)
        {
           is_leap_year=true;
        }
      if (is_leap_year)
      {
          System.out.println(" leap year");
      }
      else
      {
          System.out.println(" not leap year");
      }

    }
}
