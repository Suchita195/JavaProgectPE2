package com.stackroute.javape2;

public class IntLongFactorial {
    //For Int Factorial
    public String intFactorial() {
        String result="";
        int index  = 1;
        int factorial = 1;
        while (true)
        {
            result=result+"The factorial of "+index+" is "+factorial+"\n";
            if (Integer.MAX_VALUE / factorial < (index+1)) {
                result=result+"The factorial of" + ( index+1 ) + "is out of range.\n";
                break;
            }
            index++;//increment
            factorial *= index;//calculating factorial
        }
        return result;

    }
   // For Long Factorial
    public String longFactorial() {
        String result="";
        long index  = 1L;
        long factorial = 1L;
        while (true)
        {
            result=result+"The factorial of "+index+" is "+factorial+"\n";
            if (Long.MAX_VALUE / factorial < (index+1)) {
                result=result+"The factorial of" + ( index+1 ) + "is out of range.\n";
                break;
            }
            index++;
            factorial *= index;//calculating factorial
        }
        return result;
    }
}

