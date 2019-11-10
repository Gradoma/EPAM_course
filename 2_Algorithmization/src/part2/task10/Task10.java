// Найти положительные элементы главной диагонали квадратной матрицы.

package part2.task10;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int n = 6;
        int [][] a = generateAndPrintNums(n);

        findPositiveNums(a);
    }

    private static int [][] generateAndPrintNums (int n){
        int [][] a = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                Random random = new Random();
                a [i][j] = random.nextInt(10)-5;
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        return a;
    }

    private static void findPositiveNums (int [][] a){
        System.out.print("Positive nums in main diagonal: ");
        for (int i=0; i<a.length; i++){
            int j=i;
            if (a[i][j] > 0){
                System.out.print(a[i][j] + " ");
            }
        }
    }


}
