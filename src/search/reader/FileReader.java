package search.reader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public List<String> readFile(String filePath) {
        java.io.File input = new java.io.File(filePath);

        List<String> listOfPeople = new ArrayList<>();

        try (Scanner scanner = new Scanner(input)) {
            while(scanner.hasNextLine()){
                listOfPeople.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found");
        }
        return listOfPeople;
    }
}
