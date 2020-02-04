// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

package part2.task8;

class Task8 {
    //StringBuilder aString1 = new StringBuilder("This is usual string");
    private String basicString = "This is a usual string ";

    public static void main(String[] args) {
        Task8 task8 = new Task8();
        String maxLengthWord = "";
        int i = 0;

        while (i < task8.basicString.lastIndexOf(' ')) {
            int nextSpace = task8.basicString.indexOf(' ', i + 1);
            String tempWord = task8.basicString.substring(i, nextSpace);
            if (tempWord.length() > maxLengthWord.length()){
                maxLengthWord = tempWord;
            }
            i = nextSpace + 1;
        }
        String lastWord = task8.basicString.substring(i);
        if (lastWord.length() > maxLengthWord.length()){
            maxLengthWord = lastWord;
        }
        System.out.println("The longest word is: " + maxLengthWord);
    }
}
