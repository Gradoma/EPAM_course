package part1.task4;

public class Task4 {
    public static void main (String [] args){

        double Res1, Res2;
        double x = 451.864;

        System.out.println("x = " + x);

        Res1 = (x - (int)x)*1000 ;
        Res2 = (x - Res1/1000);

        System.out.printf("Result = %.0f,%.0f", Res1, Res2);

    }
}
