package part1.task1;

import java.util.Arrays;

public class Logic {
    private static String [] snakeCaseVariables;

    String [] toSnakeCase(String [] s){
        snakeCaseVariables = new String[s.length];
        for (int i = 0; i<s.length; i++){
            snakeCaseVariables[i] = checkChar(s[i].toCharArray());
        }
        printResultSnakeCase();
        return snakeCaseVariables;
    }

    private void printResultSnakeCase (){
        System.out.println("Variables in snake_case: " + Arrays.toString(snakeCaseVariables));
    }

    private String checkChar(char [] chars){
        char [] newChars = chars;
        for (int c = 0; c<chars.length; c++){
            if ((int)newChars[c] >= 65 & (int)newChars[c] <= 90){
                newChars = changeChar(newChars, c);
            }
        }
        return collectLettersToString(newChars);
    }

    private char[] changeChar (char [] chars, int index){
        char [] array = new char[chars.length+1];
        for (int i = 0; i < chars.length; i++){
            if (i == index){
                array[i] = '_';
                array[i+1] = (char)(((int)chars[i])+32);
                continue;
            }
            if (i > index){
                array [i+1] = chars [i];
                continue;
            }
            array[i] = chars[i];
        }
        return array;
    }

    private String collectLettersToString (char[] letters){
        String name = "";
        for (char j : letters){
            name = name + j;
        }
        return name;
    }
}
