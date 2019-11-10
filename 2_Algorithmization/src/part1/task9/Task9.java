//  В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

package part1.task9;

public class Task9 {
    public static void main(String[] args) {
        int n = 20;
        int num = 0;
        int maxFrequency = 0;
        int [] nums = generateNums(n);
        for (int i=0; i<nums.length; i++) {
            int frequency = findCommonNumbers(nums, i);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                num = nums[i];
                continue;
            }
            if (frequency == maxFrequency && nums[i] < num){
                maxFrequency = frequency;
                num = nums[i];
            }
        }
        System.out.println("Most common number is "+num+"; is repeated "+maxFrequency+" times.");
    }

    private static int [] generateNums (int n){
        int [] nums = new int[n];
        for (int i=0; i<nums.length; i++){
            nums[i] = (int) (Math.random()*10);
            System.out.println("a[" + i + "]=" + nums[i]);
        }
        return nums;
    }

    private static int findCommonNumbers (int [] nums, int i){
        int frequency = 0;
        for(int j=0; j<nums.length; j++){
            if (nums[j]==nums[i]){
                frequency++;
            }
        }
        return frequency;
    }
}

