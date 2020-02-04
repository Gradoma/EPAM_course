// Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.

package part2.task9;

class Task9 {
    private String basicString = "The Battle of Midway was a naval battle in the Pacific Theater of World War 2";

    public static void main(String[] args) {
        Task9 task9 = new Task9();
        int uppercaseCounter = 0;
        int lowercaseCounter = 0;
        int i=0;
        while (i < task9.basicString.length()){
            if (task9.basicString.codePointAt(i) >= 65 & task9.basicString.codePointAt(i) <= 90){
                uppercaseCounter++;
            } else if (task9.basicString.codePointAt(i) >= 97 & task9.basicString.codePointAt(i) <= 122){
                lowercaseCounter++;
            }
            i++;
        }

        System.out.println("String contains " + uppercaseCounter + " uppercase letters and " + lowercaseCounter + " letters.");
    }
}
