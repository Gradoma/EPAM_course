// В строке вставить после каждого символа 'a' символ 'b'.

package part2.task2;

class Task2 {
    private String basicString = "Let's insert after a char b char";

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        String result = task2.basicString.replaceAll("a", "ab");
        System.out.println(result);
    }
}
