// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.

package part1.task5;

public class Task5 {
    private String testString = "   Java  is great    opportunities   ";
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        Logic logic = new Logic();
        System.out.println("Result: " + logic.removeExtraSpaces(task5.testString));

    }
}
