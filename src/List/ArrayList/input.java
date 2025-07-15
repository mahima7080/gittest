package List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        while (true)
        {
            int val= sc.nextInt();
            if (val==0)
            {
                break;
            }
            l.add(val);
            System.out.println("enter 0 if you wan to stop adding elements");

        }
        l.set(1,25);

        Iterator it=l.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }


        for (int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }
        for (Object o:l)
        {
            System.out.println(o);
        }
    }
}
