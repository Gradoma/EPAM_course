package part4.task4;

public class Logic {
    private double[][] distanceArray;

    Logic(int size) {
        distanceArray = new double[size][size];
    }

    public double findMaxDistance (int[][] coordinates){
        findAllDistances(coordinates);
        double maxDistance = 0;
        int pointA = 0;
        int pointB = 0;
        for (int i=0; i<distanceArray.length; i++){
            for (int j=i+1; j<distanceArray[i].length; j++){
                if (distanceArray[i][j] > maxDistance){
                    maxDistance = distanceArray[i][j];
                    pointA = i+1;
                    pointB = j+1;
                }
            }
        }
        System.out.println("Max distance between points "+pointA+" and "+pointB+" ': "+maxDistance);
        return maxDistance;
    }

    private void findAllDistances(int[][] array) {
        double tempDistance;
        for (int i = 0; i < array.length; i++) {
            int pointX = array[i][0];
            int pointY = array[i][1];
            int tempX;
            int tempY;
            for (int j = i+1; j < array.length; j++) {
                tempX = array[j][0];
                tempY = array[j][1];
                tempDistance = findDistanceOfPair(pointX, pointY, tempX, tempY);
                setDistanceArray(i, j, tempDistance);
            }
        }
    }

    private double findDistanceOfPair(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));

    }

    private void setDistanceArray (int point1, int point2, double distance){
        distanceArray[point1][point2] = distance;
    }

}
