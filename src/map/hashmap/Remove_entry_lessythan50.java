package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Remove_entry_lessythan50 {
    public static void main(String[] args) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('a',30);
        map.put('b',60);

        Set<Map.Entry<Character,Integer>> set =map.entrySet();

        Iterator<Map.Entry<Character,Integer>> it=set.iterator();
        if (it.hasNext())
        {
            Map.Entry<Character,Integer > entry=it.next();
            if (entry.getValue()<50);
            it.remove();
        }

        System.out.println(map);
    }
}
