package n1.fase1.e03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
                .filter(s -> s.toLowerCase().contains("o"))
                .collect(Collectors.toList());

        System.out.println(containsLetterO);
    }
}
