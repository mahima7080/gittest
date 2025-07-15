package listt.LinkedListt;

import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Insert at beginning many times
        for (int i = 0; i < 5; i++) {
            list.addFirst("Item " + i);
        }

        // Insert at middle
        list.add(2, "Middle Item");

        // Print list
        System.out.println(list);
    }
}
