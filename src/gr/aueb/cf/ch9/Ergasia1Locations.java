package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Ergasia1Locations {

    public static void main(String[] args) {
        String inFilePath = "C:/Users/Stergios/CF7-textsExample/locations.txt";
        String outFilePath = "C:/Users/Stergios/CF7-textsExample/locations-formatted.txt";
        String line;
        String[] tokens;

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)){

            line = reader.readLine();
            while ((line = reader.readLine()) != null) {

                tokens = line.split(",");
                printFormatted(ps, tokens);
                printFormatted(System.out, tokens);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void printFormatted(PrintStream ps, String[] tokens) {
        ps.printf("{ \"Location\": \"%s\", \"latitude\": \"%s\", \"longitude\": \"%s\" },\n", tokens[0], tokens[1], tokens[2]);
    }
}
