// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

package part2.task1;

class Task1 {
    private String basicString = " One space;  Two spaces;   Three spaces;    Four spaces";

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int maxResult = 0;

        int i = task1.basicString.indexOf(' ');
        if (i == -1){
            System.out.println("String has no spaces");
        } else {
            int result = 1;
            while (i < task1.basicString.lastIndexOf(' ')){
                int nextChar = task1.basicString.indexOf(' ', i+1);
                if (nextChar - i == 1){
                    result++;
                    i++;
                    continue;
                }
                if(result > maxResult){
                    maxResult = result;
                }
                result = 1;
                i = nextChar;
            }
            System.out.println("Max amount of group spaces: " + maxResult);
        }
    }
}
