// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

package part2.task5;

class Task5 {
    private String basicString = "Аннушка уже разлила масло";

    private int countAllChars (String s, char c){
        int result = 0;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                result++;
            }
        }
        if (result == 0){
            System.out.println("String has no this char");
            return result;
        }
        System.out.println("String contains char " + c +" "+ result + " times.");
        return result;
    }

    public static void main(String[] args) {
        Task5 task5 = new Task5();
        char c = 'а';
        task5.countAllChars(task5.basicString, c);

    }
}
