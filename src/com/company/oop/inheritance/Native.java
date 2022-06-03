package com.company.oop.inheritance;

public class Native extends Person{
    private Cohort cohort;

    public Native(String name,
                  int age,
                  Gender gender,
                  MaritalStatus maritalStatus,
                  Cohort cohort
    ){
        super(name, age, gender, maritalStatus);
        System.out.println("creating native class");
        this.cohort = cohort;
        System.out.println("Finished creating native");

    }
}
