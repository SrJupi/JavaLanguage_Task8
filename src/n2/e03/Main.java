package n2.e03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringAndNumberList = new ArrayList<>();
        stringAndNumberList.add("1");
        stringAndNumberList.add("one");
        stringAndNumberList.add("One");
        stringAndNumberList.add("Wololo");
        stringAndNumberList.add("10000");
        stringAndNumberList.add("Hello");
        stringAndNumberList.add("hello");
        stringAndNumberList.add("500");

        System.out.println("Unsorted List: " + stringAndNumberList);

        //Sort comparing first letter;
        System.out.println("Sorting by first letter...");
        stringAndNumberList.sort((s1, s2) ->
                Character.valueOf(s1.toLowerCase().charAt(0))
                        .compareTo(Character.valueOf(s2.toLowerCase().charAt(0))));
        System.out.println("Sorted List: " + stringAndNumberList);

    }
}
