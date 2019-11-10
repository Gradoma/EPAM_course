// Даны действительные числа a1 ,a2 ... a2n. Найти max(a1+a2n, a2+a2n-1,...,an+an+1).

package part1.task7;

public class Task7 {
    public static void main(String[] args) {
        double [] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double maxValue = -10000;
        int numOfPairs = n.length/2;
        for (int i=1; i<=numOfPairs; i++){
            if (maxValue<findSumOfPair(n, i)){
                maxValue = findSumOfPair(n, i);
            }
        }
        System.out.println("Maximun sum : " + maxValue);
    }

    private static double findSumOfPair (double [] n, int j){
        double sumOfPair = n [j] + n.length - j + 1;
        return sumOfPair;
    }
}
