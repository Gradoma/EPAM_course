package part3.task5;

import java.math.BigDecimal;

public class Task5 {
    public static void main (String [] args) {
        BigDecimal e = new BigDecimal(0.0001);

        BigDecimal sum = new BigDecimal(0.0);
        int i = 1;
        BigDecimal current = getNextNumber(i);
        while (current.abs().compareTo(e) >= 0) {
            sum = sum.add(current);
            i++;
            current = getNextNumber(i);
        }
        System.out.println("Sum= " + sum);

        for (int j = 1;  j < 65635; j++) {
            System.out.println(((char) j) + " " + j);
        }
    }

    private static BigDecimal getNextNumber(int i) {
        double value = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
        return BigDecimal.valueOf(value);
    }
}
