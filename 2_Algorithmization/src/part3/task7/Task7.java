// Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...<=bm.
//Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<=bm в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

package part3.task7;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;

        int [] a = generateSeq(n);
        int [] b = generateSeq(m);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(makeNewSeq(a, b)));
    }

    private static int [] generateSeq(int size){
        int [] seq = new int[size];
        seq [0] = (int) (Math.random()*10);
        for (int i=1; i<size; i++) {
            seq[i] = seq[i-1]+(int)(Math.random()*10);
        }
        return seq;
    }

    private static int [] makeNewSeq(int [] a, int [] b){
        int [] newSeq = new int [a.length + b.length];
        for (int i=0; i<newSeq.length; i++){
            if (i<a.length){
                newSeq[i] = a[i];
            } else {
                newSeq[i] = b[i - a.length];
            }
        }
//        for (int j=a.length; j<newSeq.length; j++){       //Insertion sort
//            for (int k=j; k>0)
        }
        return newSeq;
    }
}
