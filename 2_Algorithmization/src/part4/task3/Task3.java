// Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

package part4.task3;

public class Task3 {
    public static void main(String[] args) {
        double a = 5;

        System.out.println("Square of hexagon: " + (6*squareOfTriangle(a)));
    }

    private static double squareOfTriangle (double a){
        double s = (Math.pow(a,2)*Math.sqrt(3)) / 4;
        return s;
    }
}
