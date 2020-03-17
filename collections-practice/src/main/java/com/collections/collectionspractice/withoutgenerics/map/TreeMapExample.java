package com.collections.collectionspractice.withoutgenerics.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap treeMap = new TreeMap();
        treeMap.put(1, "manidhar");
        treeMap.put(2, "gurvinder");
        treeMap.put(3, "ranjeet");
        treeMap.put(4, "sanjeev");
        treeMap.put(5, "ankit");
        treeMap.put(6, "vineet");
        System.out.println("printing the object:");
        System.out.println(treeMap);


        //Get iterator
        Set set = treeMap.entrySet();
        System.out.println("printing elements using iterator:");
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator1.next();
            System.out.println("key:" + mapEntry.getKey() + "-----" +
                    "value:" + mapEntry.getValue());
        }

        System.out.println("getting element by key ");
        System.out.println(treeMap.get(4));

        System.out.println("check element by key(returns boolean value)" + treeMap.containsKey(3));

        System.out.println("check element by value(returns boolean value)" + treeMap.containsValue("ankit"));
        System.out.println("remove an element by its key:::" + treeMap.remove(6));
        System.out.println("after removing ::::");
        System.out.println(treeMap);
        System.out.println("remove an element by its key and value (returns boolean value):" + treeMap.remove(3, "ranjeet"));
        System.out.println(treeMap);

        System.out.println("replacing a key and value  with another :" + treeMap.replace(2, "kondababu"));
        System.out.println("after replacing:" + treeMap);

        System.out.println("replacing a value by its key (returns boolean)" + treeMap.replace(4, "sanjeev", "vamsi"));

        System.out.println(treeMap);

        System.out.println("to get first key in object:" + treeMap.firstKey());

        System.out.println("to get last key in object:" + treeMap.lastKey());

        System.out.println("to get first entry in object:" + treeMap.firstEntry());

        System.out.println("to get last entry in object:" + treeMap.lastEntry());


    }

}
