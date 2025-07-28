package map.hashmap;

import java.util.*;

public class grouping {
    public static void main(String[] args) {
        String[] str={"java", "is", "nice" ,"am","not"};

       String s1= str[0];
       char[] arr1=s1.toCharArray();
       Arrays.sort(arr1);
        System.out.println(arr1);

        Map<Integer, List<String>> map=new HashMap<>();
        for (String s:str)
        {
            int length=s.length();
            map.putIfAbsent(length,new ArrayList<>());
            map.get(length).add(s);
        }
        System.out.println(map);
    }
}
