public class SwitchStatement {

    public static void main(String[] args) {

        var nilai = "B";

        switch (nilai) {
            case "A":
                System.out.println("Wow, anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
                break;
        }



        // Switch Lambda, hanya bisa berjalan di java 14 keatas
//        switch (nilai) {
//            case "A" -> System.out.println("Wow, anda lulus dengan baik");
//            case "B", "C" -> System.out.println("Nilai anda cukup baik");
//            case "D" -> System.out.println("Anda tidak lulus");
//            default -> {
//                System.out.println("Mungkin anda salah jurusan");
//            }
//        }



        /**
         * Kata Kunci yield
         * hanya bisa berjalan di java 14 keatas
         * mirip kayak return tapi untuk switch
          */
        // Switch Lambda tanpa yield
//        String ucapan;
//        switch (nilai) {
//            case "A" -> ucapan = "Wow, anda lulus dengan baik";
//            case "B", "C" -> ucapan = "Nilai anda cukup baik";
//            case "D" -> ucapan = "Anda tidak lulus";
//            default -> {
//                ucapan = "Mungkin anda salah jurusan";
//            }
//        }
//        System.out.println(ucapan);

        // Switch dengan yield
//        ucapan = switch(nilai) {
//            case "A":
//                yield "Wow, anda lulus dengan baik";
//            case "B", "C":
//                yield "Nilai anda cukup baik";
//            case "D":
//                yield "Anda tidak lulus";
//            default:
//                yield "Mungkin anda salah jurusan";
//        }
//        System.out.println(ucapan);
    }
}
