// Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.

package part4.task10;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int n = 123456789;
        System.out.println(Arrays.toString(intToArray(n)));
    }

    private static int[] intToArray (int n){
        int [] array = new int[findLength(n)];
        for (int i=(array.length-1); i>=0; i--){
            array[i] = n%10;
            n = n/10;
        }
        return array;
    }

    private static int findLength (int n){
        int length = 1;
        while (n/10 != 0){
            length++;
            n = n/10;
        }
        return length;
    }
}
