package org.example;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputCards= "C:\\Users\\sherr\\Downloads\\deck_15021277.csv";
        Reader reader = Files.newBufferedReader(Paths.get(inputCards));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        File file = new File(System.getProperty("user.home") + "\\Downloads\\"+"studyGuide.txt");
        FileWriter writer = new FileWriter(file);
        for (CSVRecord csvRecord : csvParser) {
            writer.write(csvRecord.get(0)+"- ");
            writer.write( csvRecord.get(1)+"\n\n");
        }
        writer.close();
    }
}