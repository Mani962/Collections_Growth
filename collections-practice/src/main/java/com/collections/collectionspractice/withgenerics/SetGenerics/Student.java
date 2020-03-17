package com.collections.collectionspractice.withgenerics.SetGenerics;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private Set<String> book;

    public Student() {
    }

    public Student(String name, Set<String> book) {
        this.name = name;
        this.book = book;
    }

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }

        this.book.add(book);
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Set<String> getBook() {
        return book;
    }

    public Student setBook(Set<String> book) {
        this.book = book;
        return this;
    }
}
