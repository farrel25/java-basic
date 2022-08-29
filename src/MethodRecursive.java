public class MethodRecursive {
    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(factorialRecursive(5));
        System.out.println(factorialRecursive(31));
        System.out.println(factorialRecursive(32));
        System.out.println(factorialRecursive(33));
        System.out.println(factorialRecursive(34));

        loop(5300);

    }

    // Using Loop
    static int factorial(int value) {
        var result = 1;
        for(var counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }

    // Recursive
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    static void loop(int val) {
        if (val == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + val);
            loop(val - 1);
        }
    }
}
