// Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

package part2.task14;

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int m = 8;
        int n = 4;
        int [][] a = generateNums(m, n);
        printArray(a);
    }

    private static int [][] generateNums (int lines, int columns){
        int [][] array = new int[lines][columns];
        Random random = new Random();
        for (int j=0; j<columns; j++){
            int counter = 0;
            for (int i=0; i<lines; i++){
                int temp = random.nextInt(2);
                if (temp == 1){
                    counter++;
                    array[i][j] = checkNum(counter, j);
                } else {
                    array [i][j] = 0;
                }
            }
        }
        return array;
    }

    private static int checkNum (int counter, int column){
        if (counter <= column+1){
            return 1;
        } else {
            return 0;
        }
    }

    private static void printArray (int [][] array){
        for (int []i : array){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
