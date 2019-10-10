package part1.task3;

import static java.lang.Math.*;
public class Task3 {
    public static void main (String [] args){
        double Res;
        double x = 5;
        double y = 15;

        Res = ((sin(x)+cos(y))*tan(x*y))/(cos(x)-sin(y));

        System.out.println("Result = " + Res);
    }
}
