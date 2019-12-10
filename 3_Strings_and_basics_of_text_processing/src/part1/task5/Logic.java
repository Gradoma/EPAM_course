package part1.task5;

public class Logic {

    String removeExtraSpaces (String str){
        char[] strChar = str.toCharArray();
        strChar = removeSideSpaces(strChar);
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

    private char[] removeSideSpaces (char [] chars){
        int left = 0;
        boolean isLeftSpaces = true;
        int right = 0;
        boolean isRightSpaces = true;
        while (isLeftSpaces | isRightSpaces){
            if (chars[left] == ' '){
                left++;
            } else {
                isLeftSpaces = false;
            }

            if (chars[(chars.length-1)-right] == ' '){
                right++;
            } else {
                isRightSpaces = false;
            }
        }
        char[] charsWithoutSides = new char[chars.length - right - left];
        int j = 0;
        for (int i=left; i<chars.length-right; i++){
            charsWithoutSides[j] = chars[i];
            j++;
        }
        return charsWithoutSides;
    }

    private String collectCharsToString (char[] letters){
        String name = "";
        for (char j : letters){
            name = name + j;
        }
        return name;
    }
}
