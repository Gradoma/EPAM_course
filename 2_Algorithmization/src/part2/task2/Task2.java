// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

package part2.task2;

public class Task2 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};

        for (int j=0; j<a.length; j++){
            int i =j;
                System.out.print(a[j][i]+" ");
            }
        }
    }

