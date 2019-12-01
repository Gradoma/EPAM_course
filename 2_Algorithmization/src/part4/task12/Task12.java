// Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
// сумма цифр которых равна К и которые не большее N.

package part4.task12;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int k = 14;
        int n = 57;
        int [] a;

        System.out.println("Result : " + Arrays.toString(findNumbersToArray(k, n)));
    }

    private static int [] findNumbersToArray (int k, int n) {
        int size = findAmount(k,n);
        int [] array = new int[size];
        if (size == 0){
            return array ;
        } else {
            int i = 1;
            for (int j=0; j<size; j++){
                while (i <= n){
                    if (findSumOfNumerals(i) == k){
                        array[j] = i;
                        i++;
                        break;
                    }
                    i++;
                }
            }
        }
        return array;
    }

    private static int findAmount (int k, int n){
        int i=1;
        int counter=0;
        while (i <= n){
            if (findSumOfNumerals(i) == k){
                counter++;
            }
            i++;
        }
        return counter;
    }

    private static int findSumOfNumerals (int n){
        int length = findAmountOfNumerals(n);
        int [] array = new int[length];
        if (length == 1){
            return n;
        }
        for (int i = length-1; i>=0; i--){
            array[i] = n%10;
            n = n/10;
        }
        int sum=0;
        for (int i:array) {
            sum += i;
        }
        return sum;
    }

    private static int findAmountOfNumerals(int n){
        int length = 1;
        while (n/10 != 0){
            length++;
            n = n/10;
        }
        return length;
    }
}
