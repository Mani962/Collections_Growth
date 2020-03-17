package com.collections.collectionspractice.withgenerics.mapGenerics;

import java.util.*;

public class HashTableGenericsExample {

    public static void main(String[] args) {


        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "manidhar");
        hashtable.put(2, "gurvinder");
        hashtable.put(3, "ranjeet");
        hashtable.put(4, "sanjeev");
        hashtable.put(5, "ankit");
        hashtable.put(6, "vineet");
        System.out.println("printing the object:");
        System.out.println(hashtable);


        //Get iterator
        Set set = hashtable.entrySet();
        System.out.println("printing elements using iterator:");
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator1.next();
            System.out.println("key:" + mapEntry.getKey() + "-----" +
                    "value:" + mapEntry.getValue());
        }

        System.out.println("getting element by key::: " + hashtable.get(4));

        System.out.println("check element by key(returns boolean value)" + hashtable.containsKey(3));

        System.out.println("check element by value(returns boolean value)" + hashtable.containsValue("ankit"));
        System.out.println("remove an element by its key:::" + hashtable.remove(6));
        System.out.println("after removing ::::");
        System.out.println(hashtable);
        System.out.println("remove an element by its key and value (returns boolean value):" + hashtable.remove(3, "ranjeet"));
        System.out.println(hashtable);

        System.out.println("replacing a key and value  with another :" + hashtable.replace(2, "kondababu"));
        System.out.println("after replacing:" + hashtable);

        System.out.println("replacing a value by its key (returns boolean)" + hashtable.replace(4, "sanjeev", "vamsi"));

        System.out.println(hashtable);

        Enumeration enumeration = hashtable.elements();
        System.out.println("printing elements using enumeration interface");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("whether hash table is empty (returns boolean value)::" + hashtable.isEmpty());

    }


}
