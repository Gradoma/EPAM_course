// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

package part2.task9;

public class Task9 {
    public static void main(String[] args) {
        int maxSum = 0;
        int maxColumn = 0;
        int [][] a = generateAndPrintNums(5,7);

        for (int j=0; j<a[0].length; j++){
            System.out.println("Sum elements in column "+ (j+1)+" : " +sumOfColumn(a,j));
            if (sumOfColumn(a,j)>maxSum){
                maxSum = sumOfColumn(a,j);
                maxColumn = j;
            }
        }
        System.out.println("Column with max sum: " + (maxColumn+1));
    }

    private static int [][] generateAndPrintNums (int i, int j){
        int [][] a = new int[i][j];
        for (int k=0; k<i; k++){
            for (int l=0; l<j; l++){
                a [k][l] = (int)(Math.random()*10);
                System.out.print(a[k][l] + " ");
            }
            System.out.println();
        }
        return a;
    }

    private static int sumOfColumn (int [][] a, int column){
        int sum = 0;
        for (int j=0; j<a.length; j++){
            sum+= a[j][column];
        }
        return sum;
    }
}
