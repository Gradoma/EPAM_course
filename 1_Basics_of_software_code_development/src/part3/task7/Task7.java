package part3.task7;

import java.util.Scanner;

public class Task7 {
    public static void main (String [] args){

        System.out.println("Enter m and n (m < n)");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        for (int i=m; i<n; i++){
            for (int delit = 2; delit<i; delit++){
                if (i%delit == 0){
                    System.out.println(delit + " is devider for " + i);
                }
            }

        }
    }
}
