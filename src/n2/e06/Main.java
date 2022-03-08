package n2.e06;

import java.util.ArrayList;
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

        //Sort numbers only;
        System.out.println("Printing only numbers...");


        List<String> newList = stringAndNumberList.stream()
                .filter(s -> s.matches("-?\\d+")) //
                .collect(Collectors.toList());

        System.out.println("Number List: " + newList);

    }
}
