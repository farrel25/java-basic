public class KonversiNumber {
    public static void main(String[] args) {

        // Widening Casting (Otomatis), kecil ke besar
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // Narrowing Casting (Manual), besar ke kecil
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2; // karena 1000 diluar range byte (-128 - 127), maka terjadi number overflow
        /**
         * Number Overflow
         * setelah dikonversi, setelah nyampe 127
         * dia akan balik lagi kebelakang, ke -128
         * terus ditambahin sampe 127 lagi
         * kalo udah nyampe 127 lagi, dia akan balik lagi ke belakang
         * jadi bakal terus muter gitu sampe hasilnya 1000
         */
    }
}
