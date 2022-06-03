package com.company.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Cohort cohort = new Cohort();
      Ancestor a = new Ancestor(
              "test",
              34,
              Gender.FEMALE,
              MaritalStatus.DIVORCED,
              cohort,
              "KPMG"
      );
    }
}
