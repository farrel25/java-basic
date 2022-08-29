public class Continue {
    public static void main(String[] args) {

        for(var counter = 1; counter <= 20; counter++) {
            if (counter % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan ganjil " + counter);
        }
    }
}
