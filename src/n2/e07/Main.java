package n2.e07;

public class Main {
    public static void main(String[] args) {
        // create functions
        OperationInterface addition = (a, b) -> a + b;
        OperationInterface subtraction = (a, b) -> a - b;
        OperationInterface multiplication = (a, b) -> a * b;
        OperationInterface division = (a, b) ->
        {
            if (b == 0) return 0;
            return a/b;
        };

        // varibles to test
        float first = 5f;
        float second = 2f;

        //print lambda functions
        System.out.println("addition: " + addition.operation(first, second));
        System.out.println("subtraction: " + subtraction.operation(first, second));
        System.out.println("multiplication: " + multiplication.operation(first, second));
        System.out.println("division: " + division.operation(first, second));




    }


}
