// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить также,
// сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

package part4.task16;

public class Task16 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Sum of numbers : " + findSumOfNumbers(n));
        System.out.println("Amount of even numerals in sum : " + findEvenNumerals(findSumOfNumbers(n)));

    }

    private static int findSumOfNumbers (int n){
        int sum = 0;
        for (int i = findMinNumber(n); i<findMaxNumber(n); i += 2){
            if (checkNumber(i)){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum of numbers = " + sum);
        return sum;
    }

    private static int findEvenNumerals (int number){
        int amountOfEven = 0;
        while (number != 0){
            if (number % 2 ==0){
                amountOfEven++;
            }
            number = number/10;
        }
        return amountOfEven;
    }

    private static boolean checkNumber (int number){
        int j = number/10;
        while (j != 0){
            int numeral = j % 10;
            if (numeral % 2 == 0){
                return false;
            }
            j = j/10;
        }
        return true;
    }

    private static int findMinNumber(int digits) {
        int[] numerals = new int[digits];
        for (int i = 0; i < numerals.length; i++) {
            numerals[i] = 1;
        }
        int minNumber = 0;
        for (int j: numerals) {
            minNumber += j * Math.pow(10, digits - 1);
            digits--;
        }
        return minNumber;
    }

    private static int findMaxNumber(int digits) {
        int[] numerals = new int[digits];
        for (int i = 0; i < numerals.length; i++) {
            numerals[i] = 9;
        }
        int maxNumber = 0;
        for (int j: numerals) {
            maxNumber += j * Math.pow(10, digits - 1);
            digits--;
        }
        return maxNumber;
    }
}
