package com.stackroute.javape2;

public class IntLongFactorial {
    public String intFactorial() {
        String result="";
        int i  = 1;
        int fn = 1;
        while (true)
        {
            result=result+"The factorial of "+i+" is "+fn+"\n";
            if (Integer.MAX_VALUE / fn < (i+1)) {
                result=result+"The factorial of" + ( i+1 ) + "is out of range.\n";
                break;
            }
            i++;
            fn *= i;
        }
        return result;

    }

    public String longFactorial() {
        String result="";
        long i  = 1L;
        long fn = 1L;
        while (true)
        {
            result=result+"The factorial of "+i+" is "+fn+"\n";
            if (Long.MAX_VALUE / fn < (i+1)) {
                result=result+"The factorial of" + ( i+1 ) + "is out of range.\n";
                break;
            }
            i++;
            fn *= i;
        }
        return result;
    }
}

