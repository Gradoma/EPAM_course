// С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

package part2.task4;

class Task4 {
    private String basicString = "информатика";

    private String simpleCollectWord(String s){
        char a = s.charAt(7);
        char b = s.charAt(3);
        char c = s.charAt(4);
        String result = "" + a + b + c + a;
        return result;
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println(task4.simpleCollectWord(task4.basicString));
    }
}
