public class OperasiMatematika {
    public static void main(String[] args) {

        byte a = 100;
        byte b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);



        // Augmented Assignment
        short c = 100;

        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);



        // Unary Operator
        byte d = 100;

        d++; // d = d + 1 atau d += 1
        System.out.println(d);

        d--; // d = d - 1 atau d -= 1
        System.out.println(d);
    }
}
