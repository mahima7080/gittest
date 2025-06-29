package Task_Abt13x.task_27_june;

import java.util.Scanner;

public class url_is_valid {
    public static void main(String[] args) {

        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        if (str.endsWith(".com")){
            System.out.println("website is :commercial site");
        }
        else  if (str.endsWith(".org"))
        {
            System.out.println("The website type is: Non-profit organization site");
        }
        else if (str.endsWith(".edu"))
        {
            System.out.println("The website type is: educational site");
        }
        else if (str.endsWith(".gov"))
        {
            System.out.println("The website type is: goverment website");
        }
        else if (str.endsWith(".info"))
        {
            System.out.println("The website type is: Informational website");
        }
        else if (str.endsWith(".net"))
        {
            System.out.println(" The website type is: Network-related website");
        }
        else
        {
            System.out.println("The website type is: Unknown or other types of websites");
        }
    }
}
