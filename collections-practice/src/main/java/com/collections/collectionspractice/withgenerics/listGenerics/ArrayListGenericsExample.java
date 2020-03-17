package com.collections.collectionspractice.withgenerics.listGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayListGenericsExample {

    public static void main(String[] args) {

        //Creating ArrayList object.
        List<String> arrayList = new ArrayList<>();
        //Add Objects to the listGenerics
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        arrayList.add("six");

//
        //lambda
        System.out.println("using lambda  expression:::");
        arrayList.forEach(item -> System.out.println(item));

        System.out.println("find an item in the listGenerics using for each method:");
        arrayList.forEach(item -> {
            if ("one".equals(item)) {
                System.out.println("print item:::" + item);
            }
        });

        System.out.println("find an item in the listGenerics using contains:");
        arrayList.stream().filter(s -> s.contains("two"))
                .forEach(System.out::println);


        //method reference
        System.out.println("method reference:::::");
        arrayList.forEach(System.out::println);

        System.out.println("find an item in the listGenerics using collect:::");
        arrayList.stream()
                .filter(item -> !item.equals("six"))
                .collect(Collectors.toList())
                .forEach(System.out::println);


        List<Person> persons = Arrays.asList(
                new Person(1, "manidhar", 30),
                new Person(2, "gurvinder", 20),
                new Person(3, "ranjeet", 40),
                new Person(4, "sanjeev", 25),
                new Person(5, "ankit", 24),
                new Person(6, "vineet", 28),
                new Person(7, "ranjeet", 40)
        );

        String name = persons.stream()
                .filter(x -> "manidhar".equals(x.getName()))
                .map(Person::getName)
                .findAny()
                .orElse("NULL");

        System.out.println(">>>>>>" + name);

        List<String> list1 = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(list1);


        System.out.println("indexof manidhar item ::" + list1.indexOf("manidhar"));


        System.out.println("last index of ranjeet item:" + list1.lastIndexOf("ranjeet"));

        System.out.println("to get the second last item using size and get method");

        String lastSecond = list1.get(list1.size() - 2);
        System.out.println("second last item ::" + lastSecond);

//      list1.forEach(System.out::println);
        List<Employee> employees = persons.stream().map(person -> {
            Employee employee = new Employee();
            employee.setAge(person.getAge());
            employee.setEmpId(person.getpId());
            employee.setEmpName(person.getName());
            if (person.getName().equals("ranjeet"))
                employee.setEmpName("front-end person");
            return employee;
        }).collect(Collectors.toList());

        System.out.println(employees);


        Stream<String> language = Stream.of("java", "python", "nodejs", null, "ruby", "reactjs", null, "php");

        System.out.println("Filter the listGenerics without null values using (Objects::nonNull)");

        List<String> result = language.filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(result);


        //------------------------------------------------------------------------------------

        System.out.println("using List<Integers> as items in the object:");
        List<Integer> integers = Arrays.asList(1, 2, 3, 7, 3, 7, 3, 9, 5, 2, 5, 2, 7, 4, 8, 9);

        int sumIntegers = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total sum of integers :" + sumIntegers);

        System.out.println("sum of 15 numbers:::");
        Stream<Integer> integerStream = Stream.iterate(1, n -> n + 1).limit(15);
        IntStream intStream = integerStream.mapToInt(x -> x);
        int sum1 = intStream.sum();
        System.out.println("Total ::" + sum1);

    }
}
