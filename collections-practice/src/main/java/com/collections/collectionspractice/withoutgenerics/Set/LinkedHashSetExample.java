package com.collections.collectionspractice.withoutgenerics.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("manidhar");
        linkedHashSet.add("gurvinder");
        linkedHashSet.add("ranjeet");
        linkedHashSet.add("sanjeev");
        linkedHashSet.add("ankit");
        linkedHashSet.add("vineet");

        System.out.println("Printing the LinkedHashSet object");
        System.out.println(linkedHashSet);

        System.out.println("print the elements using iterator...");
        Iterator iterator1 = linkedHashSet.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("size of linkedhashset object:" + linkedHashSet.size());


        System.out.println("object contains a specific element (returns a boolean value):" + linkedHashSet.contains("ankit"));
        System.out.println();
        System.out.println("checks whether object is empty :" + linkedHashSet.isEmpty());

        System.out.println("remove a particular element from object:" + linkedHashSet.remove("vineet"));

    }

}
