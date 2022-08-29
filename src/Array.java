public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Farrel";
        stringArray[1] = "Athaillah";
        stringArray[2] = "Putra";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Jana";

        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[2];



        // Array Initializer

        String[] namaNama = {
                "Farrel", "Athaillah", "Putra"
        };

        namaNama[0] = null;

        int[] arrayInt = new int[] {
                1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
                10L,20L,30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        /**
         * tidak ada penghapusan di array
         * karena panjang array sudah fix
         * jadi bisanya mengganti/mengosongkan nilai yg ingin dihapus dengan default value tipe data
         * bisa berupa null jika object, atau 0 jika primit
         */

        String[][] members = {
                {"Farrel", "Athaillah", "Putra"},
                {"Jihan", "Alifah"},
                {"Jana"}
        };

        System.out.println(members[0]);
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
