package Task_Abt13x.task_15_july;
/*
* Takes a sentence and prints how many times each word appears using HashMap.

Input: "java is easy and java is powerful"

Output:

java -> 2

is -> 2

easy -> 1

and -> 1

powerful -> 1


* */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class word_frequency_counter {
    public static void main(String[] args) {
        String str="java is easy and java is powerful";
        String[] s_arr=str.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for (String s:s_arr)
        {
           map.put(s, map.getOrDefault(s,0)+1);
        }
        System.out.println(map);

        Set<Map.Entry<String,Integer>> entries =map.entrySet();

        for (Map.Entry<String,Integer> entry:entries)
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

    }
}
