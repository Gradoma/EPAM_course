package part2.task16;

public class Square {
    int [][] square;

    Square(int n){
        square = new int[n][n];
    }

    void setSquare(Numbers nums) {
        int index = 0;
        for (int i=0; i<square.length; i++){
            for (int j=0; j<square[i].length; j++){
                square [i][j] = nums.getNumber(index);
                index++;
            }
        }
    }

    void printSquare () {
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print(square[i][j]);
            }
            System.out.println();
        }
    }
    boolean checkMagicSquare (Numbers numbers){
        return  (checkSecondaryDiagonal(numbers) & checkLines(numbers) & checkColumns(numbers) & checkPrincipalDiagonal(numbers));
    }

    private boolean checkLines(Numbers numbers){
        for (int i = 0; i<square.length; i++) {
            int tempSum = 0;
            for (int j = 0; j < square[i].length; j++) {
                tempSum += square[i][j];
            }
            if (tempSum != numbers.mainSum/square.length){
                return false;
            }
        }

        return true;
    }

    private boolean checkColumns(Numbers numbers){
        for (int j = 0; j<square[0].length; j++) {
            int tempSum = 0;
            for (int i = 0; i < square.length; i++) {
                tempSum += square[i][j];
            }
            if (tempSum != numbers.mainSum/square.length){
                return false;
            }
        }
        return true;
    }

    private boolean checkPrincipalDiagonal (Numbers numbers){
        int tempSum = 0;
        for (int i = 0; i<square.length; i++) {
            tempSum += square[i][i];
        }
        if (tempSum != numbers.mainSum/square.length){
            return false;
        }
        return true;
    }

    private boolean checkSecondaryDiagonal (Numbers numbers){
        int tempSum = 0;
        for (int i = 0; i<square.length; i++) {
            tempSum += square[i][square.length-1-i];
        }
        if (tempSum != numbers.mainSum/square.length){
            return false;
        }
        return true;
    }
}
