package search.user;

import java.util.List;

public class OutputPrinter {

    public void printFoundPeople(List<String> listOfPeople, List<Integer> foundPeople) {
        if (foundPeople==null) {
            System.out.println("No matching people found.");
        } else {
            System.out.println("Found people:");
            foundPeople.forEach(lineIndex ->System.out.println(listOfPeople.get(lineIndex)));
        }
    }

    public void printAllPeople(List<String> listOfPeople) {
        System.out.println("=== List of people ===");
        listOfPeople.forEach(System.out::println);
    }
}
