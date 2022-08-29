public class TipeDataNumber {
    public static void main(String[] args) {
        // Integer Number
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        // Floating Point Number
        float iniFloat = 10.10f; //bisa ditambahin f kecil atau besar untuk nandain itu float
        double iniDouble = 10.10;

        // Literals
        int decimalInt = 25;
        int hexaDecimal = 0xA123B; // buat bikin hexa, diawal dikasih 0x
        int binaryDecimal = 0b01010101; // buat bikin binary, diawal dikasih 0b

        /**
         * Underscore
         * mulai versi java 7 atau 8, bisa nambahin underscore di angka
         * digunakan sebagai pemisah biar ga bingung baca angka
         * penggunaan underscore tidak wajib
         */
        int amount = 1_000_000_000;
    }
}
