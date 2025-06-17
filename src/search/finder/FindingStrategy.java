package search.finder;

import java.util.*;

interface FindingStrategy {
    List<Integer> findPeople(Map<String, List<Integer>> map, String[] wordsToSearch);
}

