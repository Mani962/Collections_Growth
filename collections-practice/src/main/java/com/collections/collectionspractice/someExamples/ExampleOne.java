package com.collections.collectionspractice.someExamples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExampleOne {
    public static void main(String[] args) {

        List<String> items =
                Arrays.asList("apple", "banana", "apple",
                        "papaya", "watermelon",
                        "orange", "orange", "papaya", "apple",
                        "lemon");


        System.out.println("printing elements in the list:");
        System.out.println(items);

        Map<String, Long> map = items.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                        )
                );
        System.out.println("Counting the elements of same type:");
        System.out.println(map);

        Map<String, Long> finalMap = new LinkedHashMap<>();

        System.out.println("sort a map and add to finalMap ");
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
        System.out.println(finalMap);

        List<Item> list = Arrays.asList(
                new Item("bottle", 10, 9.99),
                new Item("bags", 20, 19.99),
                new Item("notebook", 10, 29.99),
                new Item("textbook", 10, 29.99),
                new Item("charger", 20, 9.99),
                new Item("bottle", 10, 9.99),
                new Item("bags", 10, 19.99),
                new Item("bottle", 20, 9.99)
        );

        List<Double> doubleList = list.stream()
                .map(Item::getPrice)
                .collect(Collectors.toList());

        System.out.println("using map with stream: to get price of an item:" + doubleList);

        System.out.println("Count no. of items of similar type::::");
        Map<String, Long> counting = list.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.counting()));

        System.out.println(counting);

        Map<String, Double> countQty = list.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.summingDouble(Item::getPrice))
        );
        System.out.println("total sum of price of similar type:");
        System.out.println(countQty);

        Map<String, Integer> count = list.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty))
        );
        System.out.println("total number of quantity of similar type:");
        System.out.println(count);

        Map<Double, List<Item>> listMap = list.stream().collect(Collectors.groupingBy(Item::getPrice));
        System.out.println("differentiating via price of an item::");
        System.out.println(listMap);

        Map<Double, Set<String>> result =
                list.stream()
                        .collect(Collectors.groupingBy(Item::getPrice,
                                Collectors.mapping(Item::getName, Collectors.toSet())));
        System.out.println();
        System.out.println("collect the items by similar price and mapping to set using (Collectors.mapping)");
        System.out.println(result);


//
////        --------------------------------------------------------------------------
//
//        String string="Tamarala Manidhar";
//
//        string.chars().forEach(a-> System.out.print((char)a));
//        System.out.println();
//        string.chars().parallel().forEach(a-> System.out.print((char) a));
//        System.out.println();
//        string.chars().parallel().forEachOrdered(a-> System.out.print((char)a));
//        System.out.println();
//        string.chars().forEachOrdered(a-> System.out.print((char)a));
//
    }


}
