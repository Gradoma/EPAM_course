// Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат.

package part2.task16;

public class Main {
    public static int n = 3;

    public static void main(String[] args) {
        Numbers numbers = new Numbers(n);

        Square magicSquare = new Square(n);
        magicSquare.setSquare(numbers);

        while (!magicSquare.checkMagicSquare(numbers)){
            numbers.swapNumbers();
            magicSquare.setSquare(numbers);
        }
        magicSquare.printSquare();
    }
}
