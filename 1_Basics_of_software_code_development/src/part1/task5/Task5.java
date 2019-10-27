package part1.task5;

public class Task5 {
    public static void main (String [] args){
        int t = 7195;
        int h, m, s;

        System.out.println("Time in sec: " + t + " seconds");

        h = t/3600;
        m = (t-(h*3600))/60;
        s = t - (h*3600)-(m*60);

        System.out.println("Время: " + h + "ч "+ m + "мин " + s + "с ");
    }
}
