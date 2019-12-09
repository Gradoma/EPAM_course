package part1.task5;

public class Logic {

    String replaceExtraSpaces (String str){
        char[] strChar = str.toCharArray();
        int[] extraChars = findExtraSpaces(strChar);
        char [] newStrChar = new char[strChar.length - extraChars.length];
        int j = 0;
        int i = 0;
        int k = 0;
        while (i < strChar.length) {
            if (j<extraChars.length && i == extraChars[j]){
                j++;
                i++;
                continue;
            }
            newStrChar[k] = strChar[i];
            i++;
            k++;
        }
        return collectCharsToString(newStrChar);
    }

    private int [] findExtraSpaces (char [] strChar) {
        int[] extraChars = new int[countExtraChars(strChar)];
        int i = 0;
        int j = 0;
        while (i < strChar.length) {
            if (strChar[i] == ' ') {
                boolean isSpace = true;
                i++;
                while (isSpace) {
                    if (strChar[i] == ' ') {
                        extraChars[j] = i;
                        i++;
                        j++;
                    } else {
                        isSpace = false;
                    }
                }
            }
            i++;
        }
        return extraChars;
    }

    private int countExtraChars (char [] strChar){
        int i = 0;
        int counter = 0;
        while (i < strChar.length) {
            if (strChar[i] == ' ') {
                boolean isSpace = true;
                i++;
                while (isSpace & i < strChar.length) {
                    if (strChar[i] == ' ') {
                        counter++;
                        i++;
                    } else {
                        isSpace = false;
                    }
                }
            }
            i++;
        }
        return counter;
    }

    private String collectCharsToString (char[] letters){
        String name = "";
        for (char j : letters){
            name = name + j;
        }
        return name;
    }
}
