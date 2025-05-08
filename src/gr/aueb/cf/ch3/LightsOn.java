package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * AND  car is running (>100) OR is dark.
 */
public class LightsOn {

    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        boolean isCarRunning = false;
        boolean areLightsOn = false;
        boolean isRaining = false;
        boolean isDark = false;
        int carSpeed = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert if it is raining:");
        isRaining = sc.nextBoolean();
        System.out.println("Please insert if it is dark:");
        isDark = sc.nextBoolean();
        System.out.println("Please insert the speed of the car:");
        carSpeed = sc.nextInt();

        isCarRunning = carSpeed > MAX_CAR_SPEED;
        areLightsOn = isRaining && (isCarRunning || isDark );
        System.out.println("The car will have the lights on: " + areLightsOn);
    }
}
