package part3.task3;

public class Task3 {
    public static void main (String [] args){
        double a=1;
        double x=0;

        while (a<=100){
            x = x + Math.pow(a,2);
            a++;
        }
        System.out.println("Sum = " + x);
    }
}
