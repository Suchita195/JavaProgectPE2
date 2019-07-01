package com.stackroute.javape2;

public class Member {
    String name;
    int age;
    double salary;
  void setData(String name, double salary, int age)
 {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    String getData() {
        return " Members Name : " + name + "\n Members Salary : " + salary + "\n Members Age : " + age;
    }
}


