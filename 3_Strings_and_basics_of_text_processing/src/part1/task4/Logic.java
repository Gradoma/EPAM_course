package part1.task4;

public class Logic {

    int findAllNumbers (String str){
        int counter = 0;
        char[] strChar = str.toCharArray();
        for (int i=0; i<str.length(); i++){
            if ((int)strChar[i] >= 48 & (int)strChar[i] <= 57){
                boolean isNumber = true;
                while (isNumber){
                    if ((int)strChar[i] < 48 | (int)strChar[i] > 57 | i==(str.length()-1)){
                        counter++;
                        isNumber = false;
                    } else {
                        i++;
                    }
                }
            }
        }
        return counter;
    }
}
