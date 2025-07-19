package Task_Abt13x.task_15_july;

import java.util.*;

/*Group words based on their length using Map<Integer, List<String>>.

Input: ["Java", "is", "fun", "cool", "Hi"]

Output:

        2 -> [is, Hi]

        3 -> [fun]

        4 -> [Java, cool]*/
public class GroupWordUsingMapNList {
    public static void main(String[] args) {


        List<String> list =Arrays.asList("java","is","fun","cool","Hi");

       // System.out.println(list);
        Map<Integer,List<String>> map=new HashMap<>();

       //Set<Map.Entry<List<String>,String>> map.entrySet();
        for (String s:list)
        {
            int l=s.length();
            map.putIfAbsent(l,new ArrayList<>());
            map.get(l).add(s);
        }

  Set<Map.Entry<Integer,List<String>>> entries=map.entrySet();
        for (Map.Entry<Integer,List<String>> entry:entries)
        {
            System.out.println(entry.getKey()+ "->"+ entry.getValue());
        }

    }
}
