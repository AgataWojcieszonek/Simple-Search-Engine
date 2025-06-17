package search;

import search.finder.Finder;
import search.reader.FileReader;
import search.user.OutputPrinter;
import search.user.UserInputHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchEngine {
    private final UserInputHandler userInputHandler = new UserInputHandler();
    private final FileReader fileReader = new FileReader();
    private final String filePath;
    private final OutputPrinter outputPrinter = new OutputPrinter();

    SearchEngine(String filePath) {
        this.filePath = filePath;
    }

    public void startEngine() {
        List<String> listOfPeople = fileReader.readFile(filePath);
        Map<String, List<Integer>> nameToLineIndexesMap = createNameToLineIndexesMap(listOfPeople);
        while (true) {
            int option = userInputHandler.chooseOption();
            switch (option) {
                case 1 -> handleFindPersonOption(nameToLineIndexesMap, listOfPeople);
                case 2 -> outputPrinter.printAllPeople(listOfPeople);
                case 0 -> {
                    System.out.println("Bye!");
                    return;
                }
                default -> System.out.println("Incorrect option! Try again.");
            }
        }
    }

    private void handleFindPersonOption(Map<String, List<Integer>> nameToLineIndexesMap, List<String> listOfPeople) {
        String strategy = userInputHandler.chooseStrategy();
        String[] wordsToSearch = userInputHandler.inputWordsToSearch();
        List<Integer> foundPeople = searchingPeople(nameToLineIndexesMap, strategy, wordsToSearch);
        outputPrinter.printFoundPeople(listOfPeople, foundPeople);
    }

    private List<Integer> searchingPeople(Map<String, List<Integer>> nameToLineIndexesMap, String strategy, String[] wordsToSearch) {
        Finder finder = new Finder();
        finder.setStrategy(strategy);
        return finder.findPeople(nameToLineIndexesMap, wordsToSearch);
    }

    private Map<String, List<Integer>> createNameToLineIndexesMap(List<String> listOfPeople) {
        Map<String, List<Integer>> nameToLineIndexesMap = new HashMap<>();
        for (String person : listOfPeople) {
            List<String> personsData = new ArrayList<>(List.of(person.toLowerCase().split(" ")));
            for (String data : personsData) {
                List<Integer> occursLines = nameToLineIndexesMap.computeIfAbsent(data, (key) -> new ArrayList<>());
                occursLines.add(listOfPeople.indexOf(person));
            }
        }
        return nameToLineIndexesMap;
    }
}
