package com.collections.collectionspractice.withgenerics.SetGenerics;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;

public class LinkedHashSetGenericsExample {

    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
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

        System.out.println("remove a particular element from object that is present:" + linkedHashSet.remove("vineet"));

        System.out.println("remove a particular element from object that is not present:" + linkedHashSet.remove("man"));

        Spliterator<String> names = linkedHashSet.spliterator();

        System.out.println("list of elements using spliterator:");

        names.forEachRemaining((n) -> System.out.println("Employee Name:" + n));
    }

}
