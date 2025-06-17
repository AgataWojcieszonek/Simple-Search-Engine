package search.finder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class AllStrategy implements FindingStrategy {

    @Override
    public List<Integer> findPeople(Map<String, List<Integer>> map, String[] wordsToSearch) {
        Set<String> keySet = map.keySet();
        List<Integer> foundPeople = new ArrayList<>();
        int count = 0;
        for (String word : wordsToSearch) {
            if (keySet.contains(word)) {
                if (count == 0) {
                    foundPeople.addAll(map.get(word));
                    count++;
                } else {
                    foundPeople.retainAll(map.get(word));
                }
            }
        }
        return foundPeople.stream().distinct().toList();
    }
}
