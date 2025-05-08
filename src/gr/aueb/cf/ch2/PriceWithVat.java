package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with vat. (fpa)
 */
public class PriceWithVat {

    public static void main(String[] args) {
        final double VAT_PRICE = 0.24;
        double inputPrice = 0;
        double finalPrice = 0;
        double vat = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert the price:");
        inputPrice = sc.nextDouble();
        vat = inputPrice * VAT_PRICE;
        finalPrice = inputPrice + vat;

        System.out.printf("Price: %.2f, Vat: %.2f, Price with vat: %.2f", inputPrice, vat, finalPrice);
        //System.out.println("the total price after the vat is: " + finalPrice + " euros");
    }
}
