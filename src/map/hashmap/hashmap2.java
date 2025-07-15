package map.hashmap;

import java.util.HashMap;
import java.util.Map;

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





    }
}
