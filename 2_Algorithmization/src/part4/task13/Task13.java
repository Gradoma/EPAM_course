// Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
// Для решения задачи использовать декомпозицию.

package part4.task13;

public class Task13 {
    public static void main(String[] args) {
        int n = 40;
        findTwins(n);
    }

    private static void findTwins(int n) {
        boolean [] a = findPrimeNumbers(n*2);
        for (int j=n-1; j<a.length-3; j++){
            if (a[j] & a[j+2]){
                System.out.println("Prime numbers " + (j+1) + " and " + (j+3) + " are twins.");
            }
        }
    }

    private static boolean [] findPrimeNumbers(int border) {
        boolean[] primeNumbers = new boolean[border];
        for (int i=0; i<border; i++){
            primeNumbers[i] = true;
        }

        primeNumbers[0] = false;
        for (int i = 2; i * i < border; i++) {
            if (primeNumbers[i-1]) {
                for (int j = i * i; j < border; j += i){
                    primeNumbers[j-1] = false;
                }
            }
        }
        return primeNumbers;
    }
}
