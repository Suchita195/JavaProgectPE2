package com.stackroute.javape2;

public class Member_Variable {

    Member obj;

    public String Member_Display() {
        obj = new Member();//object of class member created
        obj.setData("Harry Potter", 2500.3, 30);
        return obj.getData();//call the get function
    }
}