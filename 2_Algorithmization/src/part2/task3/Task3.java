// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

package part2.task3;

public class Task3 {
    public static void main(String[] args) {
        int a[][] = {{4,2,9,3,5,6}, {5,6,1,9,3,2}, {6,3,7,1,0,7}};

        printLine(a, 3);
        printColumn(a, 4);
    }

    private static void printLine (int[][] a, int k){
        System.out.print("Line "+k+" : ");
        for (int i=0; i<a[k-1].length; i++){
            System.out.print(a[k-1][i]+" ");
        }
        System.out.println();
    }

    private static void printColumn (int[][] a, int p){
        System.out.print("Column "+p+" : ");
        for (int j=0; j<a.length; j++){
            System.out.print(a[j][p-1]+" ");
        }
        System.out.println();
    }
}
