// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий
// надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

package part4.task17;

public class Task17 {
    private int a = 62;
    private int counter = 0;

    public static void main(String[] args) {
        Task17 task = new Task17();

        System.out.println("Subtract " + task.findTimesToZero(task.a) + " times to get zero");
    }

    private int findTimesToZero (int number){
        int sumOfNumerals = findSumOfNumerals(number);
        number = number - sumOfNumerals;
        counter++;
        if (number != 0){
            findTimesToZero(number);
        }
        return counter;
    }

    private int findSumOfNumerals (int n){
        int sum = 0;
        while (n != 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
