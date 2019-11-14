// Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента a(i) и a(i+1) . Если  a(i)<=a(i+1), то продвигаются
//на один элемент вперед. Если a(i)>a(i+1) , то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.

package part3.task6;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int n = 77;
        int [] a = generateSeq(n);
        System.out.println("Basic array: ");
        System.out.println(Arrays.toString(a));
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(sortShell(a)));

    }

    private static int [] generateSeq(int size){
        int [] seq = new int[size];
        seq [0] = (int) (Math.random()*100);
        for (int i=1; i<size; i++) {
            seq[i] = (int)(Math.random()*100);
        }
        return seq;
    }

    private static int [] sortShell (int [] array){
        int i=1;
        while (i<array.length){
            if (array[i]<array[i-1]){
                swap(array, i-1, i);
                if (i>1){
                    i--;
                }
            } else {
                i++;
            }
        }
        return array;
    }

    private static int [] swap (int [] array, int first, int second){
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
        return  array;
    }
}
