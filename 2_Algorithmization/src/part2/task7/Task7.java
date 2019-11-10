// Сформировать квадратную матрицу порядка N по правилу и подсчитать количество положительных элементов в ней.

package part2.task7;

public class Task7 {
    public static void main(String[] args) {
        int n = 6;
        double a [][] = new double[n][n];

        System.out.println("Amount of positive numbers: " + calculatePositiveNums(generateNums(a,n)));
    }

    private static double [][] generateNums (double nums [][], int n){
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++){
                nums[i][j] = Math.sin((double)((i*i - j*j)/2));
            }
        }
        return nums;
    }

    private static int calculatePositiveNums (double nums [][]){
        int counter = 0;
        for (double [] i: nums) {
            for (double j: i){
                if (j >0){
                    counter++;
                }
            }
            
        }
        return counter;
    }
}
