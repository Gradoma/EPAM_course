// Даны две неубывающие последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm . Требуется указать те места,
// на которые нужно вставлять элементы последовательности b1<=b2<=...<=bm в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

package part3.task7;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int n = 4;
        int m = 8;

        int [] a = generateSeq(n);
        int [] b = generateSeq(m);

        System.out.println("Sequence a: ");
        System.out.println(Arrays.toString(a));
        System.out.println("Sequence b: ");
        System.out.println(Arrays.toString(b));
        combineSeq(a, b);

    }

    private static int [] generateSeq(int size){
        int [] seq = new int[size];
        seq [0] = (int) (Math.random()*10);
        for (int i=1; i<size; i++) {
            seq[i] = seq[i-1]+(int)(Math.random()*10);
        }
        return seq;
    }

    private static void combineSeq (int [] a, int [] b){
        int [] newSeq = new int[a.length + b.length];
        int i = 0;
        int n = 0;
        int m = 0;
        while (n<=a.length-1 & m<=b.length-1){
            if (a[n] < b[m]){
                newSeq[i] = a[n];
                if (n == a.length-1){
                    newSeq [i+1] = b[m];
                    System.out.println("b[" +m+ "]= " +b[m]+" - position in a[]: " +(i+1+1));
                    i++;
                    m++;
                    break;
                } else {
                    n++;
                }
            } else {
                newSeq[i] = b[m];
                System.out.println("b[" +m+ "]= " +b[m]+" - position in a[]: " +(i+1));
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
                System.out.println("b[" +j+ "]= " +b[j]+" - position in a[]: " +(i+1+1));
                i++;
            }
        }
        if (m == b.length-1 && n != a.length-1){
            for (int j = n; j < a.length; j++) {
                newSeq[i + 1] = a[j];
                i++;
            }
        }
        System.out.println("Combined sequence: ");
        System.out.println(Arrays.toString(newSeq));
    }
}
