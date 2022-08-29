public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

//        if (nilai >= 75) {
//            ucapan = "Selamat anda lulus";
//        } else {
//            ucapan = "Siahkan coba lagi";
//        }

        ucapan = nilai >= 75 ? "Selamat anda lulus":"Siahkan coba lagi";

        System.out.println(ucapan);
    }
}
