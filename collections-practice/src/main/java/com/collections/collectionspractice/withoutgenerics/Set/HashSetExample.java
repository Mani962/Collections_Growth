package com.collections.collectionspractice.withoutgenerics.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set hashSet = new HashSet();
        hashSet.add("manidhar");
        hashSet.add("gurvinder");
        hashSet.add("ranjeet");
        hashSet.add("sanjeev");
        hashSet.add("ankit");
        hashSet.add("vineet");

        System.out.println("Printing the Hash SetGenerics object");
        System.out.println(hashSet);

        System.out.println("print the elements using iterator...");
        Iterator iterator1 = hashSet.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

            System.out.println("size of hash set object:" + hashSet.size());


            System.out.println("object contains a specific element (returns a boolean value):" + hashSet.contains("ankit"));
            System.out.println();
            System.out.println("checks whether object is empty :" + hashSet.isEmpty());

            System.out.println("remove a particular element from object:" + hashSet.remove("vineet"));

            System.out.println();
    }

}
