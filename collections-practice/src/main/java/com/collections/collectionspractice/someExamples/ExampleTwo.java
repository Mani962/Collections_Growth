package com.collections.collectionspractice.someExamples;

import java.util.Arrays;
import java.util.stream.Stream;

public class ExampleTwo {
    public static void main(String[] args) {

        System.out.println("Printing enum values :::");
        System.out.println(Arrays.toString(Programming.values()));
        System.out.println();
        System.out.println("Using enum to pass into a stream: and eliminating SCALA :");
        Stream.of(Programming.values())
                .filter(x->!x.toString().equals("SCALA"))
                .forEach(System.out::println);


    }
}
