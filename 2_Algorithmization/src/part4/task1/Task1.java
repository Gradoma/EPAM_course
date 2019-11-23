// Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел.

package part4.task1;

public class Task1 {
    public static void main(String[] args) {
        int a = 24;
        int b = 18;

        Logic logic = new Logic(a, b);
        logic.printResult();
    }
}
