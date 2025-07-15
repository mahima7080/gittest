package listt;

import java.util.ArrayList;

public class program2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(103);

        list2.add("mahi");

                list2.add("sanu");
                list2.add("lavi");

                ArrayList l=new ArrayList();
                l.add(list);
                l.add(list2);

                for (Object o:l)
                {
                    System.out.print(o);
                }
    }
}
