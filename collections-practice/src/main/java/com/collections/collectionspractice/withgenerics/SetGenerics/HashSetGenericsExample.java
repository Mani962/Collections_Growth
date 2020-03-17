package com.collections.collectionspractice.withgenerics.SetGenerics;

import java.util.*;
import java.util.stream.Collectors;

public class HashSetGenericsExample {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
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
        System.out.println("After removing element from list is:");
        System.out.println(hashSet);
        System.out.println();
        System.out.println("Converting hashSet Generics to Array::");
        Object[] array = hashSet.toArray();
        System.out.println(Arrays.toString(array));

        Set<String> names = new HashSet<>();
        names.add("siva");
        names.add("venky");
        names.add("sitaram");
        names.add("ganesh");

        System.out.println("printing the second list:");
        System.out.println(names);

        Set<String> otherNames = new HashSet<>(hashSet);

        otherNames.addAll(names);
        System.out.println("Adding all elements from an existing collection to a Hashset:");
        System.out.println(otherNames);


        //----------------------------------------------------------------------


        Student student1 = new Student();
        student1.setName("Manidhar");
        student1.addBook("spring boot");
        student1.addBook("java programming");
        student1.addBook("hibernate");

        Student student2 = new Student();
        student2.setName("gurvinder");
        student2.addBook("react js");
        student2.addBook("angular js");
        student2.addBook("bootstrap");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        System.out.println("-------------------------------------");
        List<String> collect =
                students.stream()
                        .map(Student::getBook)
                        .flatMap(Collection::stream)
                        .distinct()
                        .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }

}
