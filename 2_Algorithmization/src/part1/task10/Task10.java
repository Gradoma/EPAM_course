// Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.


package part1.task10;

public class Task10 {
    public static void main(String[] args) {
        int n = 5;
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int[] nums = generateNums(n);
        int i = 1;
        for (int j = 1; i+j < nums.length; j++) {
            int iteration = 1;
            while (iteration <= 2) {
                if (i+j == nums.length){
                    break;
                }
                System.out.println("  iteration: " +iteration);
                nums[i] = nums[i + j];
                nums[i + j] = 0;
                if (iteration==1){
                    i++;
                }
                iteration++;
                System.out.println(" i, iteration, j: " + i+" "+iteration+" " +j+" ");
            }
            System.out.println("IN FOR:j  "+j);
        }
        for (int k=0; k<nums.length; k++){
            System.out.print("a[" + k + "]=" + nums[k]+"  ");
        }

    }

    private static int [] generateNums (int n){
        int [] nums = new int[n];
        for (int i=0; i<nums.length; i++){
            nums[i] = (int) (Math.random()*10);
            System.out.print("a[" + i + "]=" + nums[i]+"  ");
        }
        System.out.println();
        return nums;
    }
}
