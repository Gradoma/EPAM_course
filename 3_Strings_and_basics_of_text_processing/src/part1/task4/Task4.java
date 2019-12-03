// В строке найти количество чисел.

package part1.task4;

public class Task4 {
    private String example = "1 hour is 3600 seconds. Now year 2019";

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        Logic logic = new Logic();
        System.out.println("Numerals in the string: " + logic.findAllNumbers(task4.example));
    }
}
