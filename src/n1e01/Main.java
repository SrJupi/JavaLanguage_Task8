package n1e01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        //list with all names
        ArrayList<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("ana");
        names.add("Anna");
        names.add("anna");
        names.add("Ada");
        names.add("ada");
        names.add("Alex");
        names.add("alex");
        names.add("Ale");
        names.add("ale");

        //list with names with 3 letters and start with A.
        List<String> upperAAnd3LettersNames = names.stream()
                .filter(s ->
                        (s.length()) == 3 &&
                        s.charAt(0) == 'A')
                .collect(Collectors.toList());

        System.out.println(upperAAnd3LettersNames);
    }
}
