// Дана строка, содержащая следующий текст (xml-документ). Напишите анализатор, позволяющий последовательно возвращать
// содержимое узлов xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
// Пользоваться готовыми парсерами XML для решения данной задачи нельзя.

package part3.task2;

import part3.task2.logic.Logic;

public class Main {

    public static void main(String[] args) throws Exception {
        Logic logic = new Logic();
        System.out.println(logic.parse("F:\\My Projects\\EPAM\\epam-courses\\3_Strings_and_basics_of_text_processing\\src\\part3\\task2\\data\\data.xml"));

    }

}
