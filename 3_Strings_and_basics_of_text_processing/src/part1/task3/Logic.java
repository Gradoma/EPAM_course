package part1.task3;

public class Logic {
    int findAllNumerals (String str){
        int counter = 0;
        char[] strChar = str.toCharArray();
        for (int i=0; i<str.length(); i++){
            if ((int)strChar[i] >= 48 & (int)strChar[i] <= 57 ){
                counter++;
            }
        }
        return counter;
    }
}
