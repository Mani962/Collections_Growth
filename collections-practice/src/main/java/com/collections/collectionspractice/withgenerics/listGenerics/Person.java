package com.collections.collectionspractice.withgenerics.listGenerics;

public class Person {

    private int pId;
    private String name;
    private int age;

    public Person(int pId, String name, int age) {
        this.pId = pId;
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public int getpId() {
        return pId;
    }

    public Person setpId(int pId) {
        this.pId = pId;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pId=" + pId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
