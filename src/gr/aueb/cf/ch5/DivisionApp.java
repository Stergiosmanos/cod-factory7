package gr.aueb.cf.ch5;

/**
 * Double demo
 */
public class DivisionApp {

    public static void main(String[] args) {
        double num1 = 8.5;
        double num2 = 3.1;
        double div = 0d; // ιδιο με double div = 0D; κεφαλαιο d
        double mod = 0.0;
        float myFloat = 42.523F;

        div = num1 / num2;
        mod = num1 % num2;

        System.out.printf("Div: %.2f\n", div);
        System.out.printf("Mod: %.3f\n", mod);
        System.out.printf("Float: %f\n", myFloat);
        System.out.printf("Float: %3.2f", myFloat);
    }
}
