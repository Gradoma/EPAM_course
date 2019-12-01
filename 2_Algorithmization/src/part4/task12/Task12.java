// Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
// сумма цифр которых равна К и которые не большее N.

package part4.task12;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int k = 13;
        int n = 157;
        int [] a;

        int i=1;
        int counter=0;
        while (i <= n){
            if (findSumOfNumerals(i, findLength(i)) == k){
                System.out.println(i + " - num");
                counter++;
            }
            i++;
        }
        a = new int[counter];
        if (counter == 0){
            System.out.println("No numbers");
        } else {
            i = 1;
            for (int j=0; j<counter; j++){
                while (i <= n){
                    if (findSumOfNumerals(i, findLength(i)) == k){
                        a[j] = i;
                        i++;
                        break;
                    }
                    i++;
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }

    private static int findLength (int n){
        int length = 1;
        while (n/10 != 0){
            length++;
            n = n/10;
        }
        return length;
    }

    private static int findSumOfNumerals (int n, int length){
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
}
