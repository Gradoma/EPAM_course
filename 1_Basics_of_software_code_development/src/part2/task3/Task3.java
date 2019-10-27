package part2.task3;

public class Task3 {
    public static void main (String [] args){
        double x1 = 1, y1 = 3;
        double x2 = 3, y2 = 2;
        double x3 = 5, y3 = 3;
        double k1, k2;

        k1 = (y2 - y1)/(x2 - x1);
        k2 = (y3 - y2)/(x3 - x2);

        if (k1 == k2){
            System.out.println("Points on the line");
        } else {
            System.out.println("Points not on the line");
        }

    }
}
