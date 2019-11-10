// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего

package part2.task1;

public class Task1 {
    public static void main(String[] args) {
        int a[][] = {{4,2,9,3,5,3}, {5,6,1,9,3,2}, {6,3,7,1,0,1}};

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[0].length; i+= 2) {
                if (a[0][i] <= a[a.length-1][i]){
                    continue;
                }
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
