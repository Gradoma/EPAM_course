// Дана последовательность целых чисел a1 ,a2 ... an . Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min (a1 ,a2 ... an).

package part1.task8;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        int [] n = {3 , 5 , 15 ,3, 5, 78, 11, 12, 3 , 6, 3};
        ArrayList<Integer> newN = makeNewSequence(findMinElement(n), n);
        System.out.println("New sequence: " + newN);

        }
    private static int findMinElement (int [] n){
        int minElement = n[0];
        for (int i=1; i<n.length-1; i++){
            if (n[i]<minElement){
                minElement = n[i];
            }
        }
        return minElement;
    }
    private static ArrayList<Integer> makeNewSequence (int min, int [] n) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i=0; i<n.length; i++){
            if (min!=n[i]){
                newList.add(n[i]);
            }
        }
        return newList;
    }
}
