// Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an .Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

package part3.task3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int n = 12;
        int [] a = generateSeq(n);
        System.out.println(Arrays.toString(a));
        sortSelection(a);
        System.out.println(Arrays.toString(a));
    }

    private static int [] generateSeq(int size){
        int [] seq = new int[size];
        seq [0] = (int) (Math.random()*100);
        for (int i=1; i<size; i++) {
            seq[i] = (int)(Math.random()*100);
        }
        return seq;
    }

    private static int [] sortSelection (int [] array){
        for (int i = 0; i<array.length; i++){
            int max = 0;
            int indexOfMax = 0;
            for (int j=i; j<array.length; j++){
                if (array[j]>max){
                    max = array[j];
                    indexOfMax = j;
                }
            }
            array[indexOfMax] = array [i];
            array[i] = max;
        }
        return array;
    }
}
