package com.stackroute.javape2;

public class Powerof4Checker {
    public boolean powerof4Checker(int num) {
        // check for number greater than 0
        while(num>0){
            if(num<=1){
                return true;
            }

            if(num%4!=0){
                return false;
            }else{
                num=num/4;
            }
        }

        return false;//if number is less than 0
    }


}
