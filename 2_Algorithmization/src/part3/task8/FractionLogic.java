package part3.task8;

class FractionLogic {

    public Fraction[] sortFractions (Fraction [] array){
        convertFraction(array, findCommonDenominator(array));
        sortArray(array);
        return array;
    }

    private int findCommonDenominator (Fraction [] array){
        int maxDenominator = 0;
        int commonDenominator = 1;
        boolean isLCM = true;
        int j = 1;

        for (int i=0; i<array.length; i++){
            if (array[i].getDenominator() > maxDenominator){
                maxDenominator = array[i].getDenominator();
            }
        }

        while (isLCM){
            isLCM = false;
            commonDenominator = maxDenominator * j;
            for (int i=0; i<array.length; i++){
                if (commonDenominator % array[i].getDenominator() != 0){
                    isLCM = true;
                    j++;
                    break;
                }
            }
        }
        return commonDenominator;
    }

    private Fraction [] convertFraction (Fraction [] array, int commonDenominator){
        for (Fraction i: array) {
            i.setNumerator((commonDenominator / i.getDenominator())*i.getNumerator());
            i.setDenominator(commonDenominator);
        }
        return array;
    }

    private Fraction [] sortArray(Fraction [] array){
        for (int i=array.length-1; i>=0; i--) {
            int max = 0;
            int indexOfMax = 0;
            for (int j=i; j>=0; j--){
                if (array[j].getNumerator()>max){
                    max = array[j].getNumerator();
                    indexOfMax = j;
                }
            }
            array[indexOfMax].setNumerator(array[i].getNumerator());
            array[i].setNumerator(max);
        }
        return array;
    }
}
