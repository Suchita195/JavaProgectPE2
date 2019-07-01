package com.stackroute.javape2;

public class AvgMaxMinOfGrades {
    public String avgMaxMinOfGrades(int n,int[]grades)
    {
        String output;
        int min=0,max=0;
        double avg=0.0,sum=0.0;
        for(int i=0;i<grades.length;i++) {
            if (grades[i] > 0 && grades[i] < 100) {
                for (i = 0; i < grades.length - 1; i++) {

                    if (grades[i] < grades[i + 1]) {
                        min = grades[i];
                    } else {
                        max = grades[i + 1];
                    }

                    sum = sum + grades[i];


                }
            } else
                output = "Value is out of range";
        }

            avg=sum/n;
          output="Average is:" + avg + "Maximum is:" + max + "Minimum is:" + min;

              return output;
        }
    }
