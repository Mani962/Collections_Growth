package com.collections.collectionspractice.withoutgenerics.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        Map hashMap = new HashMap();
        hashMap.put(1, "manidhar");
        hashMap.put(2, "gurvinder");
        hashMap.put(3, "ranjeet");
        hashMap.put(4, "sanjeev");
        hashMap.put(5, "ankit");
        hashMap.put(6, "vineet");


        System.out.println("Printing the object:");
        System.out.println(hashMap);

        //Get iterator
        Set set = hashMap.entrySet();
        System.out.println("printing elements using iterator:");
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator1.next();
            System.out.println("key:" + mapEntry.getKey() + "-----" +
                    "value:" + mapEntry.getValue());
        }

        System.out.println("getting element by key ");
        System.out.println(hashMap.get(4));

        System.out.println("check element by key(returns boolean value)" + hashMap.containsKey(3));

        System.out.println("check element by value(returns boolean value)" + hashMap.containsValue("ankit"));
        System.out.println("remove an element by its key:::" + hashMap.remove(6));
        System.out.println("after removing ::::");
        System.out.println(hashMap);
        System.out.println("remove an element by its key and value (returns boolean value):" + hashMap.remove(3, "ranjeet"));
        System.out.println(hashMap);

        System.out.println("replacing a key and value  with another :" + hashMap.replace(2, "kondababu"));
        System.out.println("after replacing:" + hashMap);

        System.out.println("replacing a value by its key (returns boolean)" + hashMap.replace(4, "sanjeev", "vamsi"));

        System.out.println(hashMap);


        int idNum = 75;
        HashMap map = init();
        System.out.println("Student with id number " + idNum + " is "
                + map.getOrDefault(idNum, "John Doe"));

        System.out.println(map);
    }

    private static HashMap init() {
        // declare the hashmap
        HashMap mapStudent = new HashMap();
        // put contents to our HashMap
        mapStudent.put(73654, "Shyra Travis");
        mapStudent.put(98712, "Sharon Wallace");
        return mapStudent;
    }

}
