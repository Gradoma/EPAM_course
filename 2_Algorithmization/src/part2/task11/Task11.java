// Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

package part2.task11;

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        int[][] a = fillArray(10, 20);
        findFives(a);
    }

    private static int[][] fillArray(int i, int j) {
        int[][] array = new int[i][j];
        Random random = new Random();
        for (int n = 0; n < array.length; n++) {
            for (int m = 0; m < array[n].length; m++) {
                array[n][m] = random.nextInt(15);
                System.out.print(array[n][m] + " ");
            }
            System.out.println();
        }
        return array;
    }

    private static void findFives(int[][] a) {
        System.out.print("Line(s) with three or more '5': ");
        for (int i = 0; i < a.length; i++) {
            int res = 0;
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 5) {
                    res++;
                }
            }
            if (res >= 3) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
