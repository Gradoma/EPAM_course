// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

package part2.task12;

import java.util.Random;

public class Task12 {

    public static void main(String[] args) {
        int [][] a = fillArray(5, 7);
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
        for (int line = 0; line<array.length; line++){
            for (int out = array[line].length-1; out>=1; out--){
                for (int in = 0; in<out; in++){
                    if (array[line][in] > array[line][in+1]){
                        int temp = array [line][in+1];
                        array [line][in+1] = array [line][in];
                        array [line][in] = temp;
                    }
                }
            }
        }
        return array;
    }

    private static int [][] sortArrayDescend (int [][] array){
        for (int line = 0; line<array.length; line++){
            for (int out = array[line].length-1; out>=1; out--){
                for (int in = 0; in<out; in++){
                    if (array[line][in] < array[line][in+1]){
                        int temp = array [line][in+1];
                        array [line][in+1] = array [line][in];
                        array [line][in] = temp;
                    }
                }
            }
        }
        return array;
    }
}
