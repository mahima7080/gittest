package Task_Abt13x.task_15_july;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapp {
    public static void main(String[] args) {
        Map<String,Integer> map=new TreeMap<>();
        map.put("Ravi",80);
        map.put("Anjali",95);
        map.put("Dipak",75);
        System.out.println(map);

        Set<Map.Entry<String,Integer>> entries=map.entrySet();

        for (Map.Entry<String,Integer> entry:entries)
        {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
