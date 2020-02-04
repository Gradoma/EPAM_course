// Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
// операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
// отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.

package part3.task1;

class Main {
    private String basicString = "Start spreading the news, I'm leaving today. I want to be a part of it - New York, New York." +
            "\n" + "These vagabond shoes are longing to stray right through the very heart of it - New York, New York." +
            "\n" + "I want to wake up in a city, that never sleeps. And find I'm A number one, top of the list! King of the hill, A number one!";

    public static void main(String[] args) {
        Main main = new Main();
        Logic logic = new Logic();
        System.out.println("Paragraph sorting by amount of sentences:");
        System.out.println(logic.sortParagBySentences(main.basicString));

        System.out.println("Sentences sorting by words length: ");
        System.out.println(logic.sortSentencesByWords(main.basicString));

        System.out.println("Words sorting by char: ");
        System.out.println(logic.sortWordsByChar(main.basicString));


    }
}
