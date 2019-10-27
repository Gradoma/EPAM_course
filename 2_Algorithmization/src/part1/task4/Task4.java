//  Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

package part1.task4;

public class Task4 {
    public static void main(String[] args) {
        double a[] = {5.2, 3.1, 0.5, -10.2, 15.3, 2.1, 0.0, -1.0};
        double minElement = a[0];
        double maxElement = a[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i=1; i<a.length; i++){
            if (a[i]<minElement){
                minElement = a[i];
                minIndex = i;
            } else if (a[i]>maxElement){
                maxIndex = i;
                maxElement = a[i];
            }
        }

        double temp = a[maxIndex];
        a [maxIndex] = a[minIndex];
        a [minIndex] = temp;

        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+", ");
        }


    }

}
