package part4.task4;

import java.util.Scanner;

public class Coordinates {
    private int [][] coordinatesArray;
    Scanner scanner = new Scanner(System.in);

    Coordinates(int n){
        coordinatesArray = new int[n][2];
        for (int i = 0; i< n; i++){
            fillArray(i);
        }
    }

    public int [][] getCoordinatesArray(){
        return coordinatesArray;
    }

    private void fillArray (int i){
        System.out.println("Enter X coordinate of " + (i+1)+" point");
        coordinatesArray[i][0] = scanner.nextInt();
        System.out.println("Enter Y coordinate of " + (i+1)+" point");
        coordinatesArray[i][1] = scanner.nextInt();
    }
}
