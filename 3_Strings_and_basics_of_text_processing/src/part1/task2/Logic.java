package part1.task2;

public class Logic {

    String findAndReplace (String line, String target, String replacement){
        char [] lineChars = line.toCharArray();
        char [] targetChars = target.toCharArray();
        char [] replacementChars = replacement.toCharArray();

        for (int i=0; i<lineChars.length; i++){
            if (lineChars[i] == targetChars[0]){
                if (checkAllLetters(lineChars, i, targetChars)){
                    lineChars = replace(lineChars, i, (i+target.length()-1), replacementChars);
                }
            }
        }
        return collectLettersToString(lineChars);
    }

    private boolean checkAllLetters (char [] line, int i, char [] target){
        int j=1;
        while (j < target.length){
            if (line[i+1] != target[j]){
                return false;
            }
            j++;
            i++;
        }
        return true;
    }

    private char[] replace (char [] line, int startPoint, int endPoint, char[] rep){
        char[] newLine = new char[line.length - (endPoint - startPoint +1) + rep.length];
        for (int i=0; i<line.length; i++){
            if (i == startPoint){
                int j = 0;
                while (j < rep.length){
                    newLine [i+j] = rep[j];
                    j++;
                }
                i = endPoint;
                continue;
            }
            if (i > endPoint){
                int j = 0;
                while (i<line.length){
                    newLine[startPoint + rep.length + j] = line[i];
                    i++;
                    j++;
                }
                continue;
            }
            newLine[i] = line[i];
        }
        return newLine;
    }

    private String collectLettersToString (char[] letters){
        String name = "";
        for (char j : letters){
            name = name + j;
        }
        return name;
    }
}
