// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

package part4.task11;

public class Task11 {
    public static void main(String[] args) {
        int a = 13456;
        int b = 1346;
        compareLengthNums(a, b);
    }

    private static int compareLengthNums (int x, int y){
        int max;
        if (findLength(x) > findLength(y)){
            System.out.println(x + " : has more numerals (" + findLength(x)+ " numerals)");
            max = findLength(x);
        } else if (findLength(x) == findLength(y)) {
            System.out.println("Numbers have the equal amount of numerals (" + findLength(x) + ")");
            max = findLength(x);
        } else {
            System.out.println(y + " : has more numerals (" + findLength(y)+ " numerals)");
            max = findLength(y);
        }
        return max;
    }

    private static int findLength (int n){
        int length = 1;
        while (n/10 != 0){
            length++;
            n = n/10;
        }
        return length;
    }
}
