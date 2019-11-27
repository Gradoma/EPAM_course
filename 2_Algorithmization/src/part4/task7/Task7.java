// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

package part4.task7;

public class Task7 {
    public static void main(String[] args) {
        int leftBorder = 1;
        int rightBorder = 9;
        System.out.println("Sum of factorials: " + findSumFactorial(leftBorder, rightBorder));
    }

    private static int findSumFactorial (int a, int b){
        int sum = 0;
        for ( ; a <= b; a = a+2){
            sum += findFactorial(a);
        }
        return sum;
    }

    private static int findFactorial (int n){
        int nFactorial = 1;
        for (int i=1; i <= n; i++){
            nFactorial *= i;
        }
        return nFactorial;
    }
}
