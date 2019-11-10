// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).

package part2.task6;

public class Task6 {
    public static void main(String[] args) {
        int n = 10;
        if (n % 2 != 0) {
            n += 1;
        }
        int a[][] = new int[n][n];

        for (int j = 0; j < a.length; j++) {
           if (j<a.length/2){
                for (int i = 0; i < a[j].length; i++) {
                    if (i < j || i >= n - j) {
                        a[j][i] = 0;
                        continue;
                    }
                    a[j][i] = j + 1;
                }
                continue;
                }
           for (int i = 0; i < n; i++){
                a[j][i] = a [Math.abs(j+1-a.length)][i];
           }
        }

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
