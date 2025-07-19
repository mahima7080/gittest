package Task_Abt13x.task_15_july;

import java.util.*;

public class Iterations {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        Scanner scanner=new Scanner(System.in);

        while (true)
        {
            System.out.println("enter the key or enter exit to stop");
         String s1=scanner.nextLine();
         if(s1.equalsIgnoreCase("exit"))
            {
                break;
            }

            System.out.println("enter the value");
            String s2=scanner.nextLine();

         map.put(s1,s2);

        }

      Set<Map.Entry<String,String>> entries= map.entrySet();
        for (Map.Entry<String,String> entry:entries)
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        System.out.println();


        Set<String> s= map.keySet();
        for (String s1:s)
        {
            System.out.println(s1+"->"+map.get(s1));
        }

        System.out.println();

        Set<Map.Entry<String,String>> set=map.entrySet();
        Iterator<Map.Entry<String, String>> iterator=set.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }
}
