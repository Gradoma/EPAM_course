// Из заданной строки получить новую, повторив каждый символ дважды.

package part2.task6;

class Task6 {
    private String basicString = "Аннушка уже разлила масло";

    private String doubleChars (String s){
        String s1 = "";
        for(int i=0; i<s.length(); i++){
            s1 = s1 + s.charAt(i) + s.charAt(i);
        }
        return s1;
    }

    public static void main(String[] args) {
        Task6 task6 = new Task6();
        System.out.println(task6.doubleChars(task6.basicString));
    }
}
