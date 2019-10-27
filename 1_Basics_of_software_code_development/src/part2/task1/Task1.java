package part2.task1;

public class Task1 {
    public static void main (String [] args) {
        int ang3;
        int ang1 = 125;
        int ang2 = 60;

        if (ang1+ang2 >= 180){
            System.out.println("Triangle doesn't exist");
        } else {
            System.out.print("Triangle exist");
            ang3 = 180 - ang1 - ang2;
            if (ang3 == 90){
                System.out.println("It's right triangle");
            }
        }
    }
}
