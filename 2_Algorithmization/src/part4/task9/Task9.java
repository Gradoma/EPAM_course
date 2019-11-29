// Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
// если угол между сторонами длиной X и Y— прямой.

package part4.task9;

public class Task9 {
    public static void main(String[] args) {
        double x = 5;
        double y = 7;
        double z = 8;
        double t = 2;

        findSquare(x, y ,z ,t);
    }

    private static void findSquare (double x, double y, double z, double t){
        if (check(x, y, z, t)){
            double s = (0.5 * x * y) + squareOfTriangle(Math.sqrt(x*x + y*y), z, t);
            System.out.println("Square= " + s);
        } else {
            System.out.println("Quadrilateral doesn't exist.");
        }
    }

    private static boolean check (double x, double y, double z, double t){
        double max = Math.max(Math.sqrt(x*x + y*y), Math.max(z, t));
        return (max < Math.sqrt(x*x + y*y)+z+t-max);
    }

    private static double squareOfTriangle (double a, double b, double c){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
