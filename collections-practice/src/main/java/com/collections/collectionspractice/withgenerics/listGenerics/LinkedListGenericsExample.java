package com.collections.collectionspractice.withgenerics.listGenerics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListGenericsExample {

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("four");
        linkedList.add("five");
        linkedList.add("six");


        //taking another listGenerics....

        List<String> anotherList = new LinkedList<>();
        anotherList.add("hundred");
        anotherList.add("two-hundred");
        anotherList.add("three-hundred");
        anotherList.add("four-hundred");
        anotherList.add("five-hundred");

        System.out.println(linkedList);

        linkedList.forEach(System.out::println);

        String name = linkedList.stream()
                .filter(i -> i.contains("oe"))
                .findAny()
                .orElse("Null");


        System.out.println(">>>" + name);

        System.out.println("Iterating elements in the listGenerics using iterator:");
        Iterator iterator1 = linkedList.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("using limit in the listGenerics:");

        List list = linkedList.stream()
                .limit(3L)
                .collect(Collectors.toList());

        System.out.println("<<<<<<" + list);
        System.out.println("Printing the size of object:" + linkedList.size());

        System.out.println("get an element by index value (2)::");
        System.out.println("<><><><>" + linkedList.get(2));

        System.out.println("removing an element by index::(3)");
        System.out.println(linkedList.remove(3));

        System.out.println("after removing the element:(size is)" + linkedList.size());

        //using add All method
        linkedList.addAll(3, anotherList);
        System.out.println("after adding another object at specified index in listGenerics:" + linkedList);

        System.out.println("whether listGenerics is empty:(returns boolean value)" + linkedList.isEmpty());

        System.out.println(linkedList.size());
        System.out.println("removing an element by object::(one)");
        linkedList.remove("one");
        System.out.println(linkedList.size());
        System.out.println(linkedList);

        System.out.println("find the index using object value:::" + linkedList.indexOf("hundred"));

        System.out.println("to clear elements in listGenerics:");
        linkedList.clear();
        System.out.println("after clearing:" + linkedList);
    }
}
