package com.company.oop.inheritance;

public class Person {
    private String name;
    private int age;
    private Gender gender;
    private MaritalStatus maritalStatus;

    public Person(String name, int age, Gender gender, MaritalStatus maritalStatus) {
        System.out.println("Creating person class");
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        System.out.println("finished creating person class");
    }
}
