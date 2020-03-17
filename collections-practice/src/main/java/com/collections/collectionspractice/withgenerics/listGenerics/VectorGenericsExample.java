package com.collections.collectionspractice.withgenerics.listGenerics;

import java.util.Vector;

public class VectorGenericsExample {
    public static void main(String[] args) {


        Vector<String> vector = new Vector<>();
        vector.add("Jai");
        vector.add("Mahesh");
        vector.add("Hemant");
        vector.add("Vishal");
        vector.add("shalini");

        System.out.println("printing vector object:");
        System.out.println(vector);

        //adding element at specified index
        vector.add(2, "Naren");
        System.out.println("after adding element at 2nd position");
        System.out.println(vector);

        //getting elements by index
        System.out.println("Element at index 2 is: " + vector.get(2));

        //getting first element
        System.out.println("The first element of this vector is: " + vector.firstElement());

        //getting last element
        System.out.println("The last element of this vector is: " + vector.lastElement());

        //how to check vector is empty or not
        System.out.println("Is this vector empty: (returns boolean value)" + vector.isEmpty());

        System.out.println("to check the capacity of object:" + vector.capacity());
    }
}
