package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Askisi2345Ch5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        int inputNum = 0;
        int inputNum2 = 0;
        boolean isNumPrime = false;
        //int num1max =

//        int squareNum = squareNumber(inputNum);
//        System.out.printf("The square of the %d is %d", inputNum, squareNum);

        fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("%f C = %f F", celsius, fahrenheit);

     //   isNumPrime = isPrime(inputNum2);
        System.out.println("The number you entered is prime:" + isNumPrime);



    }

    public static double celsiusToFahrenheit(double celsius) {
            return celsius * 9.0 / 5.0 + 32;
    }

    public static int squareNumber(int inputNum) {
        return inputNum^2;
    }

//    public static boolean isPrime(int inputNum2) {
//        if (inputNum2 % inputNum2 == 0 || inputNum2 % 1 == 0) {
//            return true;
//        }
//    }


}
