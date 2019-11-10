// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).

package part2.task4;

public class Task4 {
    public static void main(String[] args) {
        int n = 6;
        if (n%2!=0){
            n+=1;}

        int a[][] = new int[n][n];

        for (int j=0; j<a.length; j++){
            if (j%2!=0){
                for (int i=0; i<a[j].length; i++){
                    a[j][i] = n-i;
                    System.out.print(a[j][i] + " ");
                }
                System.out.println();
                continue;
            }
            for (int i=0; i<a[j].length; i++){
                a[j][i] = i+1;
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
