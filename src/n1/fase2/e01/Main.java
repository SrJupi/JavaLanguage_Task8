package n1.fase2.e01;

public class Main {
    public static void main(String[] args) {
        GetDoubleInterface piDouble;
        piDouble = () -> 3.1415;
        System.out.println("Pi Value is " + piDouble.getPiValue());

    }
}