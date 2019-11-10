// Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm . Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

package part3.task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;

        int [] a = generateSeq(n);
        int [] b = generateSeq(m);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(combineSeq(a, b)));

    }

    private static int [] generateSeq(int size){
        int [] seq = new int[size];
        seq [0] = (int) (Math.random()*10);
        for (int i=1; i<size; i++) {
            seq[i] = seq[i-1]+(int)(Math.random()*10);
        }
        return seq;
    }

    private static int [] combineSeq (int [] a, int [] b){
        int [] newSeq = new int[a.length + b.length];
        int i = 0;
        int n = 0;
        int m = 0;
        while (n<=a.length-1 & m<=b.length-1){
            if (a[n] < b[m]){
                newSeq[i] = a[n];
                if (n == a.length-1){
                    newSeq [i+1] = b[m];
                    break;
                } else {
                    n++;
                }
            } else {
                newSeq[i] = b[m];
                if (m == b.length-1){
                    newSeq [i+1] = a[n];
                    break;
                } else {
                    m++;
                }
            }
            i++;
        }
        if (n == a.length-1 && m != b.length-1){
            for (int j = m; j < b.length; j++) {
                newSeq[i + 1] = b[j];
                i++;
            }
        }
        if (m == b.length-1 && n != a.length-1){
            for (int j = n; j < a.length; j++) {
                newSeq[i + 1] = a[j];
                i++;
            }
        }
        return newSeq;
    }
}
