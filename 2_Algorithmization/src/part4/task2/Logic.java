package part4.task2;

import java.util.Arrays;

public class Logic {
    private int [] array;
    private int i = 1;
    private int gcd;

    Logic(int [] nums){
        array = new int[nums.length];
        for (int j=0; j<nums.length; j++) {
            array[j] = Math.abs(nums[j]);
        }
    }

    public void findGcd () {
        gcd = array[0];
        while (i < array.length){
            gcd = findGcdOfPair(gcd, array[i]);
            i++;
        }
        printResult();
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

    private void printResult(){
        System.out.println("Numbers: " + Arrays.toString(array));
        System.out.println("GCD of these numbers: " + gcd);
    }
}
