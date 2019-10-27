package part2.task5;

public class Task5 {
    public static void main (String [] args){
        double f;
        double x = 4;

        if (x <= 3){
            f = (Math.pow(x, 2) - 3*x + 9);
        } else {
            f = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("f(x) = " + f);
    }
}
