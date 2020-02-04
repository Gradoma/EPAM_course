package part3.task1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {

    String sortParagBySentences(String str) {
        String[] paragArray = str.split("\\n");

        for (int i = 0; i < paragArray.length; i++) {
            int minInd = i;
            for (int j = i; j < paragArray.length; j++) {
                if (sentenceAmount(paragArray[j]) < sentenceAmount(paragArray[minInd])) {
                    minInd = j;
                }
            }
            String temp = paragArray[i];
            paragArray[i] = paragArray[minInd];
            paragArray[minInd] = temp;
        }
        StringBuilder resultString = new StringBuilder();
        for (String s : paragArray) {
            resultString.append(s);
            resultString.append("\n");
        }
        return resultString.toString();
    }

    String sortSentencesByWords(String str) {
        String[] paragArray = str.split("\\n");
        int i = 0;
        String result = "";
        while (i < paragArray.length){
            String[] wordsArray = paragArray[i].split("\\s");
            result += presentation(sortWordsByLength(wordsArray)).toString();
            result += "\n";
            i++;
        }
        return result;
    }

    String sortWordsByChar (String str){
        char key = getKeyChar();
        String[] sentences = str.split("[.!?]");
        StringBuilder result = new StringBuilder();
        for (String s : sentences){
            if (s.indexOf(key) == -1){
                continue;
            }
            result.append(sortWordsInSentence(s, key));
            result.append("\n");
        }
        return result.toString();
    }

    private char getKeyChar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char for searching");
        String s = sc.nextLine();
        return s.toCharArray()[0];
    }

    private String sortWordsInSentence (String sentence, char key){
        String[] words = sentence.split("[\\s,;:-]");
        Arrays.sort(words);
        int keyMaxCount ;
        int keyMaxIndex = 0;
        StringBuilder resultSentence = new StringBuilder();

        do {
            keyMaxCount = 0;
            for (int i=0; i<words.length; i++){
                int tempCounter = countChars(words[i], key);
                if (tempCounter == 0){
                    continue;
                }
                if (tempCounter == keyMaxCount){
                    compareByAlphabet(words, keyMaxIndex, i);
                }
                if (tempCounter > keyMaxCount){
                    keyMaxCount = tempCounter;
                    keyMaxIndex = i;
                }
            }
            if (keyMaxCount == 0){
                resultSentence.append(appendLeftWords(words));
                break;
            }
            resultSentence.append(words[keyMaxIndex]);
            resultSentence.append(" ");
            words[keyMaxIndex] = "";
        } while (keyMaxCount > 0);

        return resultSentence.toString();
    }

    private int countChars (String s, char c){
        int result = 0;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                result++;
            }
        }
        return result;
    }

    private String[] compareByAlphabet (String[] words, int firstIndex, int secondIndex){
        if (words[firstIndex].compareToIgnoreCase(words[secondIndex]) > 0){
            String temp = words[firstIndex];
            words[firstIndex] = words[secondIndex];
            words[secondIndex] = temp;
        }
        return words;
    }

    private String appendLeftWords(String [] wordsArr){
        StringBuilder leftWords = new StringBuilder();
        for (String s : wordsArr){
            if (s.length() > 0){
                leftWords.append(s);
                leftWords.append(" ");
            }
        }
        return leftWords.toString();
    }

    private StringBuilder presentation (String[] strArr){
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strArr){
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }
        return stringBuilder;
    }

    private String[] sortWordsByLength(String[] wordsArr){
        for (int i=0; i<wordsArr.length; i++){
            int maxIndex = i;
            for (int j=i; j<wordsArr.length; j++){
                if (wordsArr[j].length() > wordsArr[maxIndex].length()){
                    maxIndex = j;
                }
            }
            String temp = wordsArr[i];
            wordsArr[i] = wordsArr[maxIndex];
            wordsArr[maxIndex] = temp;
        }
        return wordsArr;
    }

    private int sentenceAmount(String str) {
        Pattern sentence = Pattern.compile("[.!?]");
        Matcher mat2 = sentence.matcher(str);
        int counter = 0;
        while (mat2.find()) {
            counter++;
        }
        return counter;
    }
}
