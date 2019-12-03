// Замените в строке все вхождения 'word' на 'letter'.

package part1.task2;

public class Task2 {
    private String example = "A word is made up of letters. Letters are made up of words.";

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Logic logic = new Logic();
        System.out.println(logic.findAndReplace(task2.example, "word", "letter"));
    }
}
