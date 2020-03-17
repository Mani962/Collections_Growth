package com.collections.collectionspractice.withgenerics.mapGenerics;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
        hashMap.put(1, "manidhar");
        hashMap.put(2, "gurvinder");
        hashMap.put(3, "ranjeet");
        hashMap.put(4, "sanjeev");
        hashMap.put(5, "ankit");
        hashMap.put(6, "vineet");

        hashMap.forEach(2, (k, v) -> System.out.println("key->" + k + "is related with value->"
                + v + ",by thread->" + Thread.currentThread().getName()));

        System.out.println("search an element::");
        String result = hashMap.search(1, (k, v) -> {
            System.out.println(Thread.currentThread().getName());
            if (v.equals("ranjeet"))
                return k + "-" + v;
            return null;
        });
        System.out.println("result =>" + result);


        System.out.println("using getordefault method ");
        hashMap.put(8, "eight");
        System.out.println(hashMap);
        System.out.println(hashMap.getOrDefault(7, "seven"));

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        System.out.println("compute a new value for the existing key");

        System.out.println("1st print =>" + map.compute("A", (k, v) -> v == null ? 42 : v + 40));

        System.out.println("2nd print =>" + map);

        System.out.println("this will add a new (key,value) pair");

        System.out.println("3rd print=>" + map.compute("X", (k, v) -> v == null ? 42 : v + 41));

        System.out.println("4th print=>" + map);

        System.out.println("compute if present method");
        System.out.println("5th print=>" + map.computeIfPresent("X", (k, v) -> v == null ? 42 : v + 10));

        System.out.println("6th print=>" + map);
        System.out.println("compute if absent method");
        System.out.println("7th print=>" + map.computeIfAbsent("Y", (k) -> 90));
        System.out.println("8th print=>" + map);


        System.out.println("reduce method example:::");

        System.out.println("reduce exmaple=>"
                + map.reduce(2, (k, v) -> v * 2, (total, elem) -> total + elem));

        System.out.println("reduceKeys example=>"
                + map.reduceKeys(2, (key1, key2) -> key1.length() > key2.length() ? key1 + "-" + key2 : key2 + "-" + key1));

        System.out.println("reduceValues example=>"
                + map.reduceValues(2, (v) -> v * 2, (value1, value2) -> value1 > value2 ? value1 - value2 : value2 - value1));
        System.out.println("After reduce=>" + map);
    }
}
