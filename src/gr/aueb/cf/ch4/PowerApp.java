package gr.aueb.cf.ch4;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Calculates a^n
 * e.g 2^10 = 1024
 * ΩΡΑΙΟ ΚΟΛΠΑΚΙ ΓΙΑ BIG INTEGER CLASS!!!
 */
public class PowerApp {

    public static void main(String[] args) {
        BigInteger bigResult = new BigInteger("1");
        int base = 2;
        int power = 100;
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base; // για μεγαλο αριθμο που υψωνουμε σε 100 δεν θα βγαλει αποτελεσμα.
            bigResult = bigResult.multiply(BigInteger.valueOf(base));
        }

        System.out.println("Result: " + result);
        System.out.println("Result: " + bigResult);
    }
}
