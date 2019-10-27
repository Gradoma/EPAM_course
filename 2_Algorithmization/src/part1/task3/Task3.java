//  Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

package part1.task3;

public class Task3 {
    public static void main(String[] args) {
        double[] a = new double[5];
        a[0] = 1.5;
        a[1] = 3.75;
        a[2] = 0.0;
        a[3] = -150.0;
        a[4] = 1000.15;


        int numOfPosistive = 0;
        int numOfNegative = 0;
        int numOfZero = 0;

        for (double element : a){
            if (element == 0){
                numOfZero++;
            } else {
                if (element >= 0){
                    numOfPosistive++;
                } else {
                    numOfNegative++;
                }
            }
        }
        System.out.println("Number of: positives - "+numOfPosistive+"; negatives - "+numOfNegative+": zero - "+numOfZero);
    }
}
