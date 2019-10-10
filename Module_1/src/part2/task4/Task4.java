package part2.task4;

public class Task4 {
    public static void main (String [] args){
        int A = 7, B = 8;
        int x = 12, y = 7, z = 6;
        int pos = 0;

        int minHole = Math.min(A, B);
        int maxHole = Math.max(A, B);
        int minBrick = Math.min(x, Math.min (y, z));
        if (minBrick == x){
            pos = 1;
        } else if (minBrick == y){
            pos = 2;
        } else if (minBrick == z){
            pos = 3;
        }

        if (minHole < minBrick){
            System.out.println("Brick more than a hole");
        } else {
            switch (pos){
                case 1:
                    if ((y < maxHole)||(z < maxHole)){
                        System.out.println("Brick can goes through the hole");
                        break;
                    }
                case 2:
                    if ((x < maxHole)||(z < maxHole)){
                        System.out.println("Brick can goes through the hole");
                        break;
                    }
                case 3:
                    if ((x < maxHole)||(y < maxHole)){
                        System.out.println("Brick can goes through the hole");
                        break;
                    }
                default:
                    System.out.println("Brick more than the hole");
            }
        }
    }
}

