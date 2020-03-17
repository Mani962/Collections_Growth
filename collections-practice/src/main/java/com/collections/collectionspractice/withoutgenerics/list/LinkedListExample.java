package com.collections.collectionspractice.withoutgenerics.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        //Create LinkedList object.
        LinkedList linkedList = new LinkedList();

        //Add objects to the HashSet.
        linkedList.add("Amani");
        linkedList.add("Prabhjot");
        linkedList.add("Nidhi");
        linkedList.add("Vandana");
        linkedList.add("Poonam");

        System.out.println("Elements in the linkedlist:");
        System.out.println(linkedList);

        //Size of the LinkedList object.
        System.out.println("Size: "
                + linkedList.size());


        //Print the LinkedList elements using iterator.
        Iterator iterator1 = linkedList.iterator();
        System.out.println("LinkedList elements " +
                "using iterator:");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        //Add an object at the specific position.
        linkedList.add(2,"Jagdeep");
        System.out.println("after adding element at 2nd position");
        System.out.println(linkedList);

        //getting elements by index
        System.out.println("Element at index 2 is: " + linkedList.get(2));

        //Remove a element from a specific position.
        linkedList.remove(3);
        System.out.println("after removing element at 3rd position");
        System.out.println(linkedList);

        //Remove last element.
        linkedList.removeLast();
        System.out.println("after removing element at last position");
        System.out.println(linkedList);
    }
}
