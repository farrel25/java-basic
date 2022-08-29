public class MethodReturnValue {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        byte c = (byte) sum(a, b);
        int d = sum2(a, b);

        System.out.println(c);
        System.out.println(d);

        System.out.println(hitung(200, "+", 100));
        System.out.println(hitung(200, "-", 100));
        System.out.println(hitung(200, "*", 100));
    }

    static int sum(int value1, int value2) {
        long total = (byte) (value1 + value2);
        return (int) total;
    }

    static int sum2(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int val1, String opr, int val2) {
        switch (opr) {
            case "+":
                return val1 + val2;
            case "-":
                return val1-val2;
            default:
                return 0;
        }
    }
}
