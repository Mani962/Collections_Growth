package com.collections.collectionspractice.withgenerics.SetGenerics;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetGenericsExample {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("manidhar");
        treeSet.add("gurvinder");
        treeSet.add("ranjeet");
        treeSet.add("sanjeev");
        treeSet.add("ankit");
        treeSet.add("vineet");

        System.out.println("Printing the TreeSet object");
        System.out.println(treeSet);

        System.out.println("print the elements using iterator...");
        Iterator iterator1 = treeSet.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("size of treeset object:" + treeSet.size());


        System.out.println("object contains a specific element (returns a boolean value):" + treeSet.contains("ankit"));
        System.out.println();
        System.out.println("checks whether object is empty :" + treeSet.isEmpty());

        System.out.println("remove a particular element from object:" + treeSet.remove("vineet"));

        System.out.println("after removing the set is:");
        System.out.println(treeSet);

        System.out.println("For Getting first element in the set:" + treeSet.first());
        System.out.println("For Getting last element in the set:" + treeSet.last());

        System.out.println("Treeset higher :" + treeSet.higher("ankit"));

        treeSet.clear();

        System.out.println("after using clear method elements are:" + treeSet);
    }
}
