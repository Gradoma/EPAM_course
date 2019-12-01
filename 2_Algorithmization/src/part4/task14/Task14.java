// Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в
// степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

package part4.task14;

public class Task14 {
    public static void main(String[] args) {
        int k = 1000;
        findNarcissisticNumbers(k);
    }

    private static void findNarcissisticNumbers(int border){
        int i = 1;
        while (i <= border){
            if (checkCondition(i)){
                System.out.println(i + " - is narcissistic number");
            }
            i++;
        }
    }

    private static boolean checkCondition (int n){
        boolean isNarcissisticNumber = false;
        if (findAmountOfNumerals(n) == 1){
            return true;
        }
        if (findNarcissisticSum(n) == n){
            isNarcissisticNumber = true;
        }
        return isNarcissisticNumber;
    }

    private static int findAmountOfNumerals(int n){
        int length = 1;
        while (n/10 != 0){
            length++;
            n = n/10;
        }
        return length;
    }

    private static int findNarcissisticSum(int n){
        int [] numerals = numeralsArray (n);
        int sum=0;
        for (int i: numerals) {
            sum += Math.pow(i, numerals.length);
        }
        return sum;
    }

    private static int [] numeralsArray (int n){
        int [] numerals = new int[findAmountOfNumerals(n)];
        for (int i = numerals.length-1; i>=0; i--){
            numerals[i] = n%10;
            n = n/10;
        }
        return numerals;
    }
}
