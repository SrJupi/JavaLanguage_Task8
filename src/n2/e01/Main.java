package n2.e01;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringAndNumberList = new ArrayList<>();
        stringAndNumberList.add("1");
        stringAndNumberList.add("One");
        stringAndNumberList.add("Wololo");
        stringAndNumberList.add("10000");
        stringAndNumberList.add("Hello");
        stringAndNumberList.add("500");

        System.out.println("Unsorted List: " + stringAndNumberList);

        //Sort comparing string lengths;
        System.out.println("Sorting by Length...");
        stringAndNumberList.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Sorted List: " + stringAndNumberList);


    }
}
