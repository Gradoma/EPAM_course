// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

package part1.task1;

public class Task1 {
    private static String[] variables = {"firstIndex", "sumOfElements", "isCorrect", "findElement"};

    public static void main(String[] args) {
        Logic logic = new Logic();

        logic.toSnakeCase(variables);
    }
}


