// Даны дроби p1/q1, p2/q1 ... pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.

package part3.task8;

public class Main {
    public static void main(String[] args) {
        int size = 5;
        Array arrayOfFractions = new Array(size);
        arrayOfFractions.fillArray();
        System.out.println("Basic array of fractions:");
        arrayOfFractions.printArray();
        FractionLogic logic = new FractionLogic();
        System.out.println("Sorted array of fractions: ");
        logic.sortFractions(arrayOfFractions.getFractions());
        arrayOfFractions.printArray();
    }
}
