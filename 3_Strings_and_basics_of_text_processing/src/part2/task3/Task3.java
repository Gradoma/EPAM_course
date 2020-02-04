// Проверить, является ли заданное слово палиндромом.

package part2.task3;

class Task3 {
    private static String basicString = "madam";

    public static void main(String[] args) {
        int i = 0;
        boolean isPalindrome = true;
        while (i < basicString.length()/2){
            if (basicString.charAt(i) == basicString.charAt(basicString.length() - 1 - i)){
                i++;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Word is a palindrome.");
        } else {
            System.out.println("No, it's not a palindrome.");
        }
    }
}
