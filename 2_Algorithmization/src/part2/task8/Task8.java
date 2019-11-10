// В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

package part2.task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int [][] a = generateAndPrintNums(5,7);
        Scanner scanner = new Scanner(System.in);
        System.out.println("What columns would like to replace?");
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        replaceColumns(a, p, k);

    }

    private static int [][] generateAndPrintNums (int i, int j){
        int [][] a = new int[i][j];
        for (int k=0; k<i; k++){
            for (int l=0; l<j; l++){
                a [k][l] = (int)(Math.random()*100);
                System.out.print(a[k][l] + " ");
            }
            System.out.println();
        }
        return a;
    }

    private static int [][] replaceColumns (int [][] a, int p, int k){
        int[] temp = new int[a.length];
        for (int i = 0; i<a.length; i++){
            temp [i] = a[i][k-1];
            a[i][k-1] = a[i][p-1];
            a[i][p-1] = temp [i];
        }
        for (int [] i: a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        return a;
    }
}
