package com.collections.collectionspractice.withoutgenerics.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        //Creating ArrayList object.
        List arrayList = new ArrayList();

        //Add Objects to the listGenerics
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");

//        Size of the ArrayList
        System.out.println("size:" + arrayList.size());

//        print the arraylist elements
        System.out.println("ArrayList elements:");
        System.out.println(arrayList);

        //Print the elments using iterator
        Iterator iterator1 = arrayList.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        //Add an object at the specified position
        arrayList.add(2, "twenty");

        System.out.println("after adding element at 2nd position");
        System.out.println(arrayList);


        //getting elements by index
        System.out.println("Element at index 2 is: " + arrayList.get(2));


        //Remove an element at the specified position
        arrayList.remove(2);
        System.out.println("after removing element at 2nd position");
        System.out.println(arrayList);


        System.out.println("is this array listGenerics empty:" + arrayList.isEmpty());

    }

}
