package com.stackroute.javape2;

public class Member_Variable {

    Member obj;

    public String Member_Display() {
        obj = new Member();
        obj.setData("Harry Potter", 2500.3, 30);
        return obj.getData();
    }
}