package com.collections.collectionspractice.withoutgenerics.map;

import java.util.*;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, "manidhar");
        linkedHashMap.put(2, "gurvinder");
        linkedHashMap.put(3, "ranjeet");
        linkedHashMap.put(4, "sanjeev");
        linkedHashMap.put(5, "ankit");
        linkedHashMap.put(6, "vineet");
        System.out.println("printing the object:");
        System.out.println(linkedHashMap);


        //Get iterator
        Set set = linkedHashMap.entrySet();
        System.out.println("printing elements using iterator:");
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator1.next();
            System.out.println("key:" + mapEntry.getKey() + "-----" +
                    "value:" + mapEntry.getValue());
        }

        System.out.println("getting element by key ");
        System.out.println(linkedHashMap.get(4));

        System.out.println("check element by key(returns boolean value)" + linkedHashMap.containsKey(3));

        System.out.println("check element by value(returns boolean value)" + linkedHashMap.containsValue("ankit"));
        System.out.println("remove an element by its key:::" + linkedHashMap.remove(6));
        System.out.println("after removing ::::");
        System.out.println(linkedHashMap);
        System.out.println("remove an element by its key and value (returns boolean value):" + linkedHashMap.remove(3, "ranjeet"));
        System.out.println(linkedHashMap);

        System.out.println("replacing a key and value  with another :" + linkedHashMap.replace(2, "kondababu"));
        System.out.println("after replacing:" + linkedHashMap);

        System.out.println("replacing a value by its key (returns boolean)" + linkedHashMap.replace(4, "sanjeev", "vamsi"));

        System.out.println(linkedHashMap);


    }
}
