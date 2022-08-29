public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {80, 80, 40, 30, 80};
        sayCongrats("Farrel", values);
        sayCongrats("Farrel", 80, 90, 79, 48, 97);
    }

    // Without Variable Argument
//    static void sayCongrats(String name, int[] values) { // without variable argument
    static void sayCongrats(String name, int... values) { // with variable argument
        var total = 0;
        for (var val: values) {
            total += val;
        }
        var finalVal = total / values.length;

        if (finalVal >= 75) {
            System.out.println("Selamat " + name + ", anda lulus");
        } else {
            System.out.println("Maaf " + name + ", anda tidak lulus");
        }
    }
}
