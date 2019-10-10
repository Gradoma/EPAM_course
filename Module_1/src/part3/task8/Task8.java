package part3.task8;

public class Task8 {
    public static void main(String[] args) {
        int a = 1578468, b = 15234;
        int longNumber ;
        int shortNumber ;
        int index ;
        boolean result = false;

        String longString = Integer.toString(a);
        String shortString = Integer.toString(b);

        if (shortString.length() > longString.length()) {
            longString = Integer.toString(b);
            shortString = Integer.toString(a);
        }
        longNumber = longString.length();
        shortNumber = shortString.length();

        for (int i = 0; i <= (longNumber - 1); i++) {
            char c = longString.charAt(i);
            for (int x = 0; x <= (shortNumber - 1); x++) {
                index = shortString.indexOf(c);
                if (index != -1) {
                    System.out.print(c + " ");
                    result = true;
                    break;
                }
            }
        }
        if (result) {
            System.out.println("- numeral(s) contains in both numbers.");
        } else {
            System.out.println("Numerals don't match");
        }
    }
}
