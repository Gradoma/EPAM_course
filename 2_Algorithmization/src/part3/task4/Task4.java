// Сортировка обменами. Дана последовательность чисел .Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа a(i) и a(i+1) . Если a(i)>a(i+1) , то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

package part3.task4;

import java.util.Arrays;

public class Task4 {
    static int counter = 0;
    public static void main(String[] args) {
        int n = 7;
        int [] a = generateSeq(n);
        System.out.println("Basic array: ");
        System.out.println(Arrays.toString(a));
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(sortBubble(a)));
        System.out.println("Number of exchanges: " + counter);
    }

    private static int [] generateSeq(int size){
        int [] seq = new int[size];
        seq [0] = (int) (Math.random()*100);
        for (int i=1; i<size; i++) {
            seq[i] = (int)(Math.random()*100);
        }
        return seq;
    }

    private static int [] sortBubble (int [] array){
        for (int out = array.length-1; out>=1; out--){
            for (int in = 0; in<out; in++){
                if (array[in] > array[in+1]){
                    int temp = array [in+1];
                    array [in+1] = array [in];
                    array [in] = temp;
                    counter++;
                }
            }
        }
        return array;
    }
}
