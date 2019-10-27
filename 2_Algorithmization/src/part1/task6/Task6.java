//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

package part1.task6;

public class Task6 {
    public static void main(String[] args) {
        int sum = 0;
        //double [] n = generateNums (20);
        double [] n = {3, 7, 1, 5, 2, 10, 1, 3 , 5 ,9 ,5 , 7 , 6 ,7, 3 ,2 ,5, 1};
        boolean [] primeIndex = findPrimeIndex(n.length);
        for (int i=0; i<n.length; i++){
            if (primeIndex[i]){
                sum+= n[i];
            }
        }
        System.out.println("Sum of numbers with a prime indexes = " + sum);
    }

    private static boolean [] findPrimeIndex (int size){
        boolean isPrime = true;
        boolean [] primeIndex = new boolean[size];
        primeIndex [0] = false;
        for (int j=2; j<=size; j++){
            for (int k=2; k<j; k++){
                if (j%k == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primeIndex [j-1] = isPrime;
            } else isPrime=true;
        }
        return primeIndex;
    }
}
