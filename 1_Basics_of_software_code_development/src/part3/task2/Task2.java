package part3.task2;

public class Task2 {
    public static void main (String [] args){
        int x = -3;
        int b = 4;
        int h = 2;
        int y;

        while (x <= b){
            if (x<=2) {
                y = -x;
            } else {
                y = x;
            }
            System.out.println("x = " + x + "; " + "y = " + y);
            x = x + h;
        }
        if (x>b) {
            if (b>2){
                y = b;
                System.out.println("x = " + b + ";" + "y = " + y);
            } else {
                y = -b;
                System.out.println("x = " + b + ";" + "y = " + y);
            }
        }
    }
}
