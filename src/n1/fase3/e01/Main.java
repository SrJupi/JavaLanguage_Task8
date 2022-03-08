package n1.fase3.e01;

public class Main {
    public static void main(String[] args) {
        ReverseInterface ri;
        ri = (String s) -> {
            StringBuilder input = new StringBuilder();
            input.append(s);
            input.reverse();
            return input.toString();
        };

        System.out.println(ri.reverse("1, 2, 3, Test, Test!!!"));
    }
}
