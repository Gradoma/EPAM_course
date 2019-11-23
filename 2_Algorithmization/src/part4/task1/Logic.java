package part4.task1;

public class Logic {
    int max;
    int min;
    int lcm;
    int gcd;

    Logic (int first, int second){
        max = Math.max(first, second);
        min = Math.min(first, second);
        lcm = findLcm(min, max);
        gcd = findGcd(min, max);
    }

    private int findLcm (int min, int max){
        int lcm=1;

        boolean isLCM = true;
        int j = 1;

        while (isLCM) {
            isLCM = false;
            lcm = max * j;
            if (lcm % min != 0) {
                isLCM = true;
                j++;
            }
        }
        return lcm;
    }

    private int findGcd (int min, int max){
        int i = 1;
        int gcd=1;

        while (i <= min){
            if (min % i == 0 & max % i == 0){
                gcd = i;
            }
            i++;

        }
        return gcd;
    }

    void printResult (){
        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
        System.out.println(lcm + " = (" + max + "*" + min + ") / " + gcd);
    }
}
