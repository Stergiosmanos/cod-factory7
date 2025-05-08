package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;

public class Ergasia2Copy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInputFile;
        String userInputFileText;
        String path;
        String finalInputPath;
        String line;
        int b;

        System.out.println("Please enter the name of the file");
        userInputFile = scanner.nextLine();
        userInputFileText = userInputFile.concat(".txt");
        File f = new File(userInputFileText);
        path = "C:/Users/Stergios/CF7-textsExample";
        finalInputPath = path.concat(userInputFileText);



        try (FileInputStream fis = new FileInputStream(path);
             FileOutputStream fos = new FileOutputStream(path.concat(UUID.randomUUID().toString()
             .replace(":","_")).concat(userInputFileText))){

            while ( (b = fis.read()) != -1) {
                fos.write(b);
            }

            System.out.println("The absolute path  of the start file is " + finalInputPath);
            System.out.println("The name of the formatted file is" );

        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
        }


    }
}
