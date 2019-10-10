package part1.task2;

public class Task2 {
    public static void main (String [] args) {
        double Res;
        double a = 3;
        double b = 1;
        double c = 4;

        Res = ((b + Math.sqrt(Math.pow(b,2)+(4*a*c)))/(2*a))- (Math.pow(a,3)*c) + Math.pow(b,-2);

        System.out.println("Result = " + Res);
    }
}
