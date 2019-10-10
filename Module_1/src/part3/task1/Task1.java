package part3.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int x = 0;
        int n = 1;

        System.out.println("Enter positive integer");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while (n <= num){
            x = x + n;
            n++;
        }
        System.out.println("Sum = " + x);
    }
}

