package Task_Abt13x.task_15_july;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class charCounting {
    public static void main(String[] args) {
        String str="aabbccccddeef";
        char[] crr=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (char c:crr)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Set<Character> k =map.keySet();

        for (char c:k)
        {
            System.out.println(c+" "+map.get(c));
        }
        Set<Map.Entry<Character,Integer>> entries=map.entrySet();
        int max =Integer.MIN_VALUE;
        char chr='\0';
        for (Map.Entry<Character,Integer> entry:entries)
        {
            if (entry.getValue()==1)
            {
                System.out.println(entry.getKey());
            }
            if (entry.getValue()>max)
            {
                max=entry.getValue();
                chr=entry.getKey();

            }

        }
        System.out.println(chr);
    }
}
