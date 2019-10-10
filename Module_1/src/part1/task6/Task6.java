package part1.task6;

public class Task6 {
    public static void main (String [] args){
        boolean Res;
        int x = -2;
        int y = 2;

        if(((x>=-2)&&(x<=2)&&(y>0))||((x>=-4)&&(x<=4)&&(y<=0))){
            Res = true;
            System.out.println("Result = " + Res);
        } else {
            Res = false;
            System.out.println("Result = " + Res);
        }

    }
}
