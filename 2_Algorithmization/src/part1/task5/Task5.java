//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

package part1.task5;

public class Task5 {
    public static void main(String[] args) {
        int a[] = {5, 2, 0, 4, 7, 6, 10, 8};
        for (int i=0; i<a.length; i++){
            if (a[i]>i+1){
                System.out.print(a[i]+ " ");
            }
        }
    }
}
