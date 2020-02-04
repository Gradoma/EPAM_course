// Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
// знаком. Определить количество предложений в строке X.

package part2.task10;

class Task10 {
    private String basicString = "Neutral first sentences. Asking second sentence? And finally emotional last sentence!";

    public static void main(String[] args) {
        Task10 task10 = new Task10();
        int i = 0;
        int sentencesCounter = 0;

        while (i < task10.basicString.length()) {
            char temp = task10.basicString.charAt(i);
            if (temp == '.' | temp == '?' | temp == '!') {
                sentencesCounter++;
            }
            i++;
        }
        System.out.println("String contains " + sentencesCounter + " sentences.");
    }
}
