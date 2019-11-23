// На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек
// самое большое расстояние. Указание: Координаты точек занести в массив.

package part4.task4;

public class Task4 {
    public static void main(String[] args) {
        int n = 4;

        Coordinates coordinates = new Coordinates(n);

        Logic logic = new Logic(n);
        logic.findMaxDistance(coordinates.getCoordinatesArray());
    }
}
