package search.finder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class AnyStrategy implements FindingStrategy {
    public List<Integer> findPeople(Map<String, List<Integer>> map, String[] wordsToSearch) {
        Set<String> keySet = map.keySet();
        List<Integer> foundPeople = new ArrayList<>();
        for (String word : wordsToSearch) {
            if (keySet.contains(word)) {
                foundPeople.addAll(map.get(word));
            }
        }
        return foundPeople.stream().distinct().toList();
    }
}
