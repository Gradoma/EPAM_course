// Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.

package part4.task8;

public class Task8 {
    static int [] d = {1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    public static void main(String[] args) {
        int k = 2;
        int m = 8;

        findSums(k, m);
    }

    private static void findSums (int left, int right){
        for ( ; left <= right-2; left++){
            System.out.print("D[" + left+"] + D[" + (left+1) + "] + D["+(left+2)+"] = ");
            System.out.println(findSumOfTriple(left));
        }
    }

    private static int findSumOfTriple (int n){
        int sum =0;
        int i = n-1;
        while (i <= n+1){
            sum = sum + d[i];
            i++;
        }
        return sum;
    }
}
