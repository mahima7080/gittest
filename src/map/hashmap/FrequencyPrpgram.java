package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyPrpgram {
    public static void main(String[] args) {


        Map<Character,Integer> map=new HashMap<>();
        String str="programming";

        char[] c_arr=str.toCharArray();

        for (char c:c_arr)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
