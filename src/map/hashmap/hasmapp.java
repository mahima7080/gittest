package map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hasmapp {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();

        map.put("add","include");
        map.put("refuse","deny");
        map.put("demand","order");
        System.out.println(map);
        map.remove("add");
        System.out.println(map);
       String s= map.get("refuse");
        System.out.println(s);
       // map.clear();
     //   System.out.println("hi "+ map);

        Set<String> set=map.keySet();
        for (String s1:set)
        {
            System.out.println(s1+"  "+ map.get(s1));
        }

       Set<Map.Entry<String,String>> entry =map.entrySet();
        for (Map.Entry<String, String> stringStringEntry : entry) {
            System.out.println(stringStringEntry);
            System.out.println(stringStringEntry.getKey());
            System.out.println(stringStringEntry.getValue());
        }


    }
}
