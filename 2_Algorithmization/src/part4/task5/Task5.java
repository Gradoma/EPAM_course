// Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
// которое меньше максимального элемента массива, но больше всех других элементов).

package part4.task5;

public class Task5 {
    public static void main(String[] args) {
        int n = 6;
        Nums nums = new Nums(n);

        Logic logic = new Logic();
        logic.findPreMaxNumber(nums.getArrayOfNums());
    }
}
