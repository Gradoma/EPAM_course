package part2.task16;

import java.util.Random;

public class Numbers {
    public int [] numbers;
    int mainSum;

    Numbers(int n){
        numbers = new int[n*n];
        mainSum = ((numbers.length+1)/2)*numbers.length;
        for (int i=0; i< n*n; i++){
            numbers [i] = i+1;
        }
    }
    int getNumber (int index){
        return numbers[index];
    }


    int [] swapNumbers (){
        int temp;
        int firstRandomIndex = 0;
        int secondRandomIndex = 0;
        Random random = new Random();
        while (firstRandomIndex == secondRandomIndex){
            firstRandomIndex = random.nextInt(numbers.length);
            secondRandomIndex = random.nextInt(numbers.length);
        }

        temp = numbers [secondRandomIndex];
        numbers [secondRandomIndex] = numbers[firstRandomIndex];
        numbers [firstRandomIndex] = temp;

        return numbers;
    }
}
