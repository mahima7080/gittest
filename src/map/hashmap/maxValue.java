package map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maxValue {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("mahima",34);
        map.put("pooja",92);
        map.put("shweta",75);
        int topper_marks=0;
        String topper="";
int max=Integer.MIN_VALUE;
     Set<Map.Entry<String,Integer>> entries  = map.entrySet();
     for (Map.Entry<String,Integer> entry:entries)
     {
         if (entry.getValue()>max)
         {
             max=entry.getValue();
             topper=entry.getKey();
         }


     }
        System.out.println(max);
      System.out.println(topper);
    }
}
