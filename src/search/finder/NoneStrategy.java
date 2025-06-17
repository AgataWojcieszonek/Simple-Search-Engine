package search.finder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class NoneStrategy implements FindingStrategy {
    public List<Integer> findPeople(Map<String, List<Integer>> map, String[] wordsToSearch) {
        Set<String> keySet = map.keySet();
        List<Integer> listToRemove = new ArrayList<>();
        for (String word : wordsToSearch) {
            if (keySet.contains(word)) {
                listToRemove.addAll(map.get(word));
                keySet.remove(word);
            }
        }
        List<Integer> foundPeople = new ArrayList<>();
        keySet.forEach(key -> foundPeople.addAll(map.get(key)));
        foundPeople.removeAll(listToRemove);
        return foundPeople.stream().distinct().toList();
    }
}
