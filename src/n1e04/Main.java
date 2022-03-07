package n1e04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //list with all names
        ArrayList<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Locke");
        names.add("Sayid");
        names.add("Hugo");
        names.add("Desmond");
        names.add("Charlie");
        names.add("Jin");
        names.add("Omar");

        //list with names that have o.
        List<String> containsLetterO = names.stream()
                .filter(s -> s.toLowerCase().contains("o") &&
                        s.length() > 5)
                .collect(Collectors.toList());

        System.out.println(containsLetterO);
    }
}
