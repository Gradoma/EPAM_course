package part4.task6;

public class Logic {
    private int gcd = 0;

    public void checkCoprime (int [] array){
        gcd = array[0];
        int i=0;
        boolean isCompire = false;
        while (i < array.length){
            gcd = findGcdOfPair(gcd, array[i]);
            i++;
        }
        if (gcd == 1){
            isCompire = true;
        }
        printResult(isCompire);
    }

    private int findGcdOfPair (int first, int second){
        while (first != second){
            if (first > second){
                first = first - second;
            } else {
                second = second - first;
            }
        }
        return first;
    }

    private void printResult (boolean result){
        if (result){
            System.out.println("Numbers is coprime.");
        } else {
            System.out.println("Numbers isn't coprime. Greatest common divisor: " + gcd);
        }
    }
}
