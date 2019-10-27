// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

package part1.task1;

public class Task1 {
    public static void main (String [] args){
        int [] A = new int [21];
        int K = 2, sum=0;
        for (int i=1; i<=20; i++){
            A[i]=i;
            if (A[i]%K==0){
                sum+=A[i];
            }
        }
        System.out.println("Sum of elements = "+sum);
    }
}
