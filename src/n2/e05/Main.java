package n2.e05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringAndNumberList = new ArrayList<>();
        stringAndNumberList.add("1");
        stringAndNumberList.add("Amazing");
        stringAndNumberList.add("empty");
        stringAndNumberList.add("One");
        stringAndNumberList.add("Wololo");
        stringAndNumberList.add("10000");
        stringAndNumberList.add("airplane");
        stringAndNumberList.add("hello");
        stringAndNumberList.add("500");
        stringAndNumberList.add("Arnold");

        System.out.println("Normal List: " + stringAndNumberList);

        //Sort e words first;
        System.out.println("Changing A to 4...");


        List<String> newList = stringAndNumberList.stream()
                .map(s -> {
                            if (s.toLowerCase().contains("a")){
                                s = s.toLowerCase().replace("a", "4");
                            }
                            return s;
                        })
                .collect(Collectors.toList());

        System.out.println("New List: " + newList);

    }
}
