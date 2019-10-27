package part3.task4;
import java.math.BigInteger;

public class Task4 {
    public static void main (String [] args){
        long i=1;
        BigInteger mult = BigInteger.valueOf(1);

        while (i<=200){
            BigInteger pow = BigInteger.valueOf(i).pow(2);
            mult = mult.multiply(pow);
            i++;
        }
        System.out.println("Sum = " + mult);
    }
}
