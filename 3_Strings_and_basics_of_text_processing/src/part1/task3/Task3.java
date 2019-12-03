// В строке найти количество цифр.

package part1.task3;

public class Task3 {
    private String example = "1 hour contain 3600 seconds.";

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Logic logic = new Logic();
        System.out.println("Numerals in string: " + logic.findAllNumerals(task3.example));
    }
}
