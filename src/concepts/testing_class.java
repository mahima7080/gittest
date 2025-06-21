package concepts;

import java.util.Scanner;

public class testing_class {
    public static void main(String[] args) {
        while(true)
        {
            int n;
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter to 0 to stop");;
            n=scanner.nextInt();
            if (n==0)
            {
                break;
            }
            System.out.println("hi");

        }
    }
}
