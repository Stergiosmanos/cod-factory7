package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Big integer class demo
 */
public class BigIntApp {

    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("123456789987654321995");
        BigInteger bigNum2 = new BigInteger("23412378965555588");
        BigInteger result;

        result = bigNum1.add(bigNum2);

        System.out.printf("%,d", result);

    }
}
