public class Break {
    public static void main (String[] args) {

        var counter = 1;
        while (true) {
            System.out.println("Perulangan ke-" + counter);
            counter++;

            if (counter > 5) {
                System.out.println("Perulangan berhenti");
                break;
            }
        }
        System.out.println(counter);
    }
}
