package part4.task6;

import java.util.Scanner;

public class Nums {
    private int [] nums = new int[3];

    Nums (){
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<nums.length; i++){
            System.out.println("Enter the " + (i+1) + " number ");
            nums[i] = Math.abs(scanner.nextInt());
        }
    }

    public int [] getNums (){
        return  nums;
    }
}
