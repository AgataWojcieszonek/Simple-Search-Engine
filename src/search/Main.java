package search;

public class Main {
    public static void main(String[] args) {

        if (!args[0].equals("--data")) {
            System.out.println("No data file provided.");
            return;
        }

        SearchEngine searchEngine = new SearchEngine(args[1]);
        searchEngine.startEngine();
    }
}
