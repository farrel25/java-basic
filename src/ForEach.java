public class ForEach {

    public static void main(String[] args) {

        String[] names = {
                "Farrel", "Athaillah", "Putra", "Founder", "Naratik"
        };

        // Using For Loop
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Using For Each
        System.out.println("\nFOR EACH");
        for (var name: names) {
            System.out.println(name);
        }
    }
}
