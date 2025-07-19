package map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap2 {
    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();

        map.put(101,"harry potter");

        map.put(102,"avenger");

        System.out.println(map);
        System.out.println(map.size());
      //  map.clear();
      //  System.out.println(map);

        System.out.println(map.values());


       String str= map.get(101);
        System.out.println(str);
        System.out.println(map.keySet());
        Set<Integer> s= map.keySet();

        for (int k:s)
        {
            System.out.println(k);
        }



        Set<Map.Entry<Integer,String>> set=map.entrySet();

        for (Map.Entry<Integer,String> ss:set)
        {
           // System.out.println(ss.getValue());
           // System.out.println(ss.getKey());
           // System.out.println(ss.setValue("maim"));
            if (ss.getKey()==101)
            {
                ss.setValue("Titanic");
            }
            System.out.println(ss.getKey());
            System.out.println(ss.getValue().toUpperCase());
        }






        Map<Integer,Integer> map2=new HashMap<>();

        map2.put(101,78);
        map2.put(102,90);

        System.out.println(
                map2
        );

       Set<Map.Entry<Integer,Integer>> entries= map2.entrySet();
       for (Map.Entry<Integer,Integer> entry:entries)
       {
           if (entry.getKey()==101)
           {
               entry.setValue(entry.getValue()+10);//bomus marsks
           }
           System.out.println(entry.getValue());
           System.out.println(entry.getKey());
       }



    }
}
