package Task_Abt13x.task_15_july;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Input: {101="Anjali", 102="Dipak", 103="Aman", 104="Ravi"}
public class filterStuNameStartsWithA {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(101,"Anjali");
        map.put(102,"Dipak");
        map.put(103,"aman");
        map.put(104,"Ravi");

        System.out.println(map
        );

        Set<Map.Entry<Integer,String>> entries =map.entrySet();
        for (Map.Entry<Integer,String> entry:entries)
        {

            if (entry.getValue().toUpperCase().startsWith("A"))
            {
                System.out.println(entry.getKey()+" ="+ entry.getValue());
            }
        }
    }
}
