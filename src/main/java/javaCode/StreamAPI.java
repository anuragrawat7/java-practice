package main.java.javaCode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        String input = "Hello World!! Nice Safe";
        Map<String, Integer> map = Stream.of(input.split(" ")).collect(Collectors.toMap(val -> val, String::length));
        System.out.println(map);

        /*List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Asd");
        list.add("sfsaf");

        List<String> list1 = new ArrayList<>();
        list.stream().filter(val -> !val.equals("Hello")).forEach(list1::add);
        System.out.println(list1);

        List<String> sorted = list.stream().sorted().toList();
        System.out.println(sorted);*/


        /*List<Integer> integerList = List.of(23,323,434,535,535,545,567,5656,6564,5778);

        List<Integer> d= integerList.stream().distinct().filter(val -> val>500).map(val-> val/100).collect(Collectors.toList());
        System.out.println(d);

        List<Integer> sd = integerList.stream().filter(val -> val>500).map(val -> val / 100).collect(Collectors.toList());
        System.out.println(sd);*/


        /*List<Integer> list1 = List.of(1,24,55,675,768,4);

        List<Integer> list2 = list1.stream().filter(a -> a%2==0).toList();
        System.out.println(list2.stream().toList());*/

        /*List<Integer> numbers = List.of(23,45,656,77,78,88);
        int a = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(a);*/

        /*Map<String, List<String>> map=new HashMap<>();
        map.put("fruit",List.of("Apple","Banana","Guava"));
        map.put("vegetable",List.of("Apple","Banagftrna","Guavafta"));

        List<String> result = new ArrayList<>();
        map.keySet().forEach(key -> map.get(key).stream().filter(val -> val.endsWith("a")).forEach(result::add));
        System.out.println(result);*/

        /*List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(22);
        list.add(34);
        list.add(55);
        list.add(67);
        List<Integer> a = list.stream().limit(3).map(integer -> integer+6).toList();
        System.out.println(a);*/

        /*List<String> stringList = new ArrayList<>();
        stringList.add("Anurag1");
        stringList.add("Anurag2");
        stringList.add("Anurag3");
        stringList.add("Anurag4");
        List<String> newList = stringList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(newList);*/
    }
}
