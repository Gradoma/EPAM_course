// Сортировка вставками. Дана последовательность чисел a1,a2...an . Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть a1,a2...ai - упорядоченная последовательность, т. е.
//a1<=a2<=...<=ai . Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

package part3.task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 7, 8, 9, 10, 2, 5, 12 };
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(sortInsertion(a)));
    }

    private static int [] sortInsertion (int [] array){
        for (int i = 1; i < array.length; i++) {
            if (array [i] < array [i-1]){
                int temp = array [i];
                int index = binarySearchIndex (array, temp, i);
                for (int j = i; j > index; j--) {
                    array[j] = array[j - 1];
                }
                array[index] = temp;
            }
        }
        return array;
    }

    private static int binarySearchIndex (int [] array, int key, int i){
        int left = 0;
        int right = i - 1;
        while (left<right) {
            int mid = left + (right - left) / 2;
            if (key < array[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

//    private static void binarySearch(int[] array) {
//        for (int i = 1; i < array.length; i++) {
//            int temp = array[i];
//            int left = 0;
//            int right = i - 1;
//            System.out.println("Temp = "  + temp);
//            System.out.println("Start left, right = " + left + " " + right);
//            if (temp < array[i - 1]) {
//                while (left<right) {
//                    int mid = left + (right - left) / 2;
//                    System.out.println("mid= " + mid);
//                    if (temp < array[mid]) {
//                        right = mid;
//                    } else {
//                        left = mid + 1;
//                    }
//                    System.out.println("left, right = " + left + " " + right);
//                }
//                for (int j = i; j > left; j--) {
//                    array[j] = array[j - 1];
//                }
//                array[left] = temp;
//                System.out.println(Arrays.toString(array));
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }

}