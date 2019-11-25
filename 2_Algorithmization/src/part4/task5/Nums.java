package part4.task5;

import java.util.Arrays;

class Nums {
    private int [] arrayOfNums;

    Nums (int size){
        arrayOfNums = new int[size];
        for (int i=0; i<arrayOfNums.length; i++) {
            arrayOfNums[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arrayOfNums));
    }

    public int[] getArrayOfNums() {
        return arrayOfNums;
    }
}
