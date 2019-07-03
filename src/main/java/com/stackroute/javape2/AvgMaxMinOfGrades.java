package com.stackroute.javape2;

public class AvgMaxMinOfGrades {
    public String avgMaxMinOfGrades(int no_of_students,int[]grades)
    {
        String output;
        int min=0,max=0;
        double avg=0.0,sum=0.0;
        for(int index=0;index<grades.length;index++) {
            if (grades[index] > 0 && grades[index] < 100) {
                for (index = 0; index < grades.length - 1; index++) {

                    if (grades[index] < grades[index + 1]) {
                        min = grades[index];//assigning minimum
                    } else {
                        max = grades[index + 1];//assigning maximum
                    }

                    sum = sum + grades[index];//calculating sum


                }
            } else
                output = "Value is out of range";
        }

            avg=sum/no_of_students;//calculating the average
          output="Average is:" + avg + "Maximum is:" + max + "Minimum is:" + min;

              return output;
        }
    }
