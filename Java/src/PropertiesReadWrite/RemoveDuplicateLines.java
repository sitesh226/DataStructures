package PropertiesReadWrite;

import java.io.*;
import java.util.*;

public class RemoveDuplicateLines {

    public static void main(String[] args) throws Exception {

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        Set<String> uniqueLines = new LinkedHashSet<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(inputFile));

        String line;

        while ((line = reader.readLine()) != null) {
            uniqueLines.add(line);
        }

        reader.close();

        BufferedWriter writer = new BufferedWriter(
                new FileWriter(outputFile));

        for (String uniqueLine : uniqueLines) {
            writer.write(uniqueLine);
            writer.newLine();
        }

        writer.close();

        System.out.println("Duplicate lines removed.");
    }
}