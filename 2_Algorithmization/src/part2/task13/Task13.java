// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

package part2.task13;

import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        int [][] a = fillArray(8, 4);
        System.out.println("Basic array: ");
        printArray(a);
        System.out.println("Ascending order:");
        printArray(sortArrayAscend(a));
        System.out.println("Descending order: ");
        printArray(sortArrayDescend(a));
    }

    private static int[][] fillArray(int i, int j) {
        int[][] array = new int[i][j];
        Random random = new Random();
        for (int n = 0; n < array.length; n++) {
            for (int m = 0; m < array[n].length; m++) {
                array[n][m] = random.nextInt(100)-50;
            }
        }
        return array;
    }

    private static void printArray (int [][] array){
        for (int []i : array){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static int [][] sortArrayAscend (int [][] array){
        for (int column = 0; column<array[0].length; column++){
            for (int out = array.length-1; out>=1; out--){
                for (int in = 0; in<out; in++){
                    if (array[in][column] > array[in+1][column]){
                        int temp = array [in+1][column];
                        array [in+1][column] = array [in][column];
                        array [in][column] = temp;
                    }
                }
            }
        }
        return array;
    }

    private static int [][] sortArrayDescend (int [][] array){
        for (int column = 0; column<array[0].length; column++){
            for (int out = array.length-1; out>=1; out--){
                for (int in = 0; in<out; in++){
                    if (array[in][column] < array[in+1][column]){
                        int temp = array [in+1][column];
                        array [in+1][column] = array [in][column];
                        array [in][column] = temp;
                    }
                }
            }
        }
        return array;
    }
}
