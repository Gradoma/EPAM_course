package part2.task2;

public class Task2 {
    public static void main (String [] args){
        int min1, min2, res;
        int a = 8;
        int b = 10;
        int c = 4;
        int d = 9;

        if (a<b) {
            min1 = a;
        } else {
            min1 = b;
        }
        if (c<d){
            min2 = c;
        } else {
            min2 = d;
        }

        if (min1 > min2){
            res = min1;
        } else {
            res = min2;
        }
        System.out.print("Max = " + res);
    }
}
