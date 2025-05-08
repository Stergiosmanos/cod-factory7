package gr.aueb.cf.ch1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExampleApp {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("file.txt");
        BufferedInputStream bis = new BufferedInputStream(fis); // Διαβάζει μέσω buffer
        int data;
        while ((data = bis.read()) != -1) { // Διαβάζει από το buffer
            System.out.print((char) data);
        }
        bis.close();
    }
}

