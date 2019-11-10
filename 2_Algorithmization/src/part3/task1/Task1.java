// Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив

package part3.task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] a2 = {1, 2, 3, 4, 5};
        int k = 6;
        System.out.println(Arrays.toString(combine(a1, a2, k)));
    }

    private static int [] combine (int [] first, int [] second, int k){
        int [] newArray = new int[first.length + second.length];
        int i=0;
        //for (int i=0; i<newArray.length; i++){
            while (i<= k-1){
                newArray[i] = first[i];
                i++;
            }
            int j = 0;
            while (j<second.length) {
                newArray[i] = second[j];
                i++;
                j++;
            }
            while (i<newArray.length){
                newArray [i] = first [k];
                i++;
                k++;
            }
            return newArray;
    }
}
