package List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();


        arrayList.add("mahima");
        arrayList.add("mahima");
        arrayList.add(36);
        arrayList.add(true);
        arrayList.add(12.5);

        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList.isEmpty());

       // arrayList.clear();
        System.out.println("is  "+arrayList.isEmpty());
        System.out.println("-----------------------------------------------");
       for (Object o:arrayList)
        {
            System.out.println(o);
        }
        Iterator it=arrayList.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        ArrayList<String> arrlist2=new ArrayList<>();
        arrlist2.add("hi");arrlist2.add("lavi");
        arrlist2.add("sanu");
        arrlist2.add("madgu");
        System.out.println("hi"+arrlist2.isEmpty());








        Iterator itt=arrlist2.iterator();


        while (itt.hasNext())
        {
            System.out.println(
                    itt.next()
            );
        }
    }
}
