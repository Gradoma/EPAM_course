package part3.task8;

public class Array {
    private int size;
    private Fraction [] fractions;

    Array(int size){
        this.size = size;
        fractions = new Fraction[size];
    }

    public void fillArray (){
        for (int i=0; i<size; i++){
            int tempNum = (int) (Math.random()*10);
            int tempDenom = (int) ((Math.random()*10)+1);
            fractions[i] = new Fraction(tempNum, tempDenom);
        }
    }

    public void printArray(){
        for (int i = 0; i< fractions.length; i++) {
            fractions[i].printFraction();
        }
    }

    public Fraction[] getFractions() {
        return fractions;
    }
}
