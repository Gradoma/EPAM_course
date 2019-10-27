// Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

package part1.task2;

public class Task2 {
    public static void main(String[] args) {
        double z = 3.2;
        int num = 0;

        double[] a = {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0};

        for (double element : a) {
            if (element>z){
                element=z;
                num++;
            }

            System.out.print(element + " ");
        }
        System.out.println();
        System.out.print("Number of changes: " + num);
    }
}