package n1e02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //create integer list
        List<Integer> numberList = new ArrayList<>();
        //populate integer list
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 3);
        }

        String result = numberList.stream()
                .map(n -> {
                    if (n%2 == 0) return "e" + n; else return "o" + n;
                })
                .collect(Collectors.joining(","));



        System.out.println(result);



    }
}
