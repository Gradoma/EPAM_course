// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).

package part2.task5;

public class Task5 {
    public static void main(String[] args) {
        int n = 6;
            if (n%2!=0){
                n+=1;}
        int a[][] = new int[n][n];

        for (int j=0; j<a.length; j++){
            for (int i=0; i<a[j].length; i++){
                if (i >= n-j){
                    a[j][i] = 0;
                    System.out.print(a[j][i] + " ");
                    continue;
                }
                a[j][i] = j+1;
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

    }
}
