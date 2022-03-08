package n2.e04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringAndNumberList = new ArrayList<>();
        stringAndNumberList.add("1");
        stringAndNumberList.add("one");
        stringAndNumberList.add("empty");
        stringAndNumberList.add("One");
        stringAndNumberList.add("Wololo");
        stringAndNumberList.add("10000");
        stringAndNumberList.add("Hello");
        stringAndNumberList.add("hello");
        stringAndNumberList.add("500");
        stringAndNumberList.add("Excellent");

        System.out.println("Unsorted List: " + stringAndNumberList);

        //Sort e words first;
        System.out.println("Sorting words that contains 'e' first...");

        stringAndNumberList.sort(Comparator.comparing(s ->
                        (s.toLowerCase().contains("e")) ? 0 : 1));
        System.out.println("Sorted List: " + stringAndNumberList);

    }
}
