public class ForLoop {
    public static void main(String[] args) {

        // Looping tanpa henti. Tanpa init statement, condition, post statement
//        for (;;) {
//            System.out.println("perulangan tanpa henti");
//        }



        // Perulangan dengan kondisi
        var counter = 1;
        for (; counter <= 10 ;) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }
        System.out.println(counter);



        // Perulangan dengan init statement
        for (var counter2 = 1; counter2 <= 10 ;) {
            System.out.println("Perulangan ke-" + counter2);
            counter2++;
        }



        // Perulangan dengan post statement
        for (var counter2 = 1; counter2 <= 10; counter2++) {
            System.out.println("Perulangan ke-" + counter2);
        }

    }
}
