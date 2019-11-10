// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

package part2.task15;

import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        System.out.println("Basic array: ");
        int [][] a = fillArray(6, 8);
        printArray(a);
        System.out.println("Updated array: ");
        printArray(replaceOddElement(a));
    }

    private static int[][] fillArray(int i, int j) {
        int[][] array = new int[i][j];
        Random random = new Random();
        for (int n = 0; n < array.length; n++) {
            for (int m = 0; m < array[n].length; m++) {
                array[n][m] = random.nextInt(100);
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

    private static int [][] replaceOddElement (int [][] array){
        int newElement = findMaxElement(array);
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                if (array[i][j]%2 != 0){
                    array[i][j] = newElement;
                }
            }
        }
        return array;
    }

    private static int findMaxElement (int [][] array){
        int maxElement = array [0][0];
        for (int [] i : array) {
            for (int j : i){
                if (j>maxElement){
                    maxElement = j;
                }
            }

        }
        return maxElement;
    }
}
