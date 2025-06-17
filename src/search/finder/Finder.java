package search.finder;

import java.util.List;
import java.util.Map;

public class Finder {

    private FindingStrategy strategy;

    public void setStrategy(String strategyString) {
        switch (strategyString) {
            case "all" -> strategy = new AllStrategy();
            case "any" -> strategy = new AnyStrategy();
            case "none" -> strategy = new NoneStrategy();
            default -> System.out.println("Wrong strategy");
        }
    }

    public List<Integer> findPeople(Map<String, List<Integer>> map, String[] wordsToSearch) {
        return strategy.findPeople(map, wordsToSearch);
    }
}
