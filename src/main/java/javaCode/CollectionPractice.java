package main.java.javaCode;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        // List iterator - is used to return a list-iterator containing the same elements as that of the LinkedList
        // in proper and same sequence starting from a specific position or index number which is passed as a
        // parameter to this method.
/*
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ListIterator listIterator = list.listIterator(2);

        while (listIterator.hasNext())
            System.out.println(listIterator.next());
*/

/*
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set);

//        Get min and max value of list and set
        System.out.println(Collections.max(set));
        System.out.println(Collections.min(set));

//        Print element of specific index
        System.out.println(set.toArray()[1]);

*/

/*
//        LinkedHashMap allows only one null key.
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(null, "sfsaf");
        linkedHashMap.put(2, "sfasf");
        System.out.println(linkedHashMap);

//        TreeMap - No null key allowed and sorted according to the order of key
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "Rawat");
        treeMap.put(4, "Rawat");
        treeMap.put(1, "Rawat");

        System.out.println(treeMap);

        LinkedList<String> list = new LinkedList<>();
        list.add("Anurag");
        list.addFirst("First");
        System.out.println(list);

        System.out.println(list.stream().toList());
*/


    }
}
