// Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

package part4.task15;

public class Task15 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Results: ");
        findNumbers(n);
    }

    private static void findNumbers(int n) {
        int counterOfNumbers = 0;
        for (int i = findMinNumber(n); i <= findMaxNumber(n); i++) {
            int numeral = i % 10;
            int j = i / 10;
            boolean isNum = true;
            while (j / 10 != 0) {
                if (numeral <= j % 10) {
                    isNum = false;
                    break;
                }
                numeral = j % 10;
                j = j / 10;
            }
            if (isNum) {
                System.out.println(i);
                counterOfNumbers++;
            }
        }
        System.out.println("Total amount of result numbers : " + counterOfNumbers);
    }

    private static int findMinNumber(int digits) {
        int[] numerals = new int[digits];
        for (int i = 0; i < numerals.length; i++) {
            numerals[i] = i + 1;
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
        int maxNumeral = 9;
        for (int i = digits - 1; i >= 0; i--) {
            numerals[i] = maxNumeral;
            maxNumeral--;
        }

        int maxNumber = 0;
        for (int j: numerals) {
            maxNumber += j * Math.pow(10, digits - 1);
            digits--;
        }
        return maxNumber;
    }
}
