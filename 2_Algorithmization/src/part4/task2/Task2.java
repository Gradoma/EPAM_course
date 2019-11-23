// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

package part4.task2;

public class Task2 {
    public static void main(String[] args) {
        int [] nums = {12, -6, 15, 24};

        Logic logic = new Logic(nums);
        logic.findGcd();
    }

}
