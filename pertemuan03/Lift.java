public class Lift {
    public static void main(String[] args) {

        // nama dan nim
        System.out.println("Zharifah Dzikra Purnomo");
        System.out.println("0110222050");

        // ini adalah lantai yang tidak tersedia yaitu 13
        int unavailableFloor = 13;

        // ini adalah lantai yang ingin dituju
        int floor = 19;

        // ini adalah lantai paling akhir
        int finalFloor = 18;

        // menggunakan pengkondisian if-else

        // jika lantai yang diminta kurang dari 13, print lantai saat ini
        if (floor < unavailableFloor) {
            System.out.println("Anda sedang berada di Lantai " + floor);
        }

        // jika lantai yang diminta sama dengan 13
        // print "Harap menekan tombol nomor 14 untuk menuju lantai 13"
        else if (floor == unavailableFloor) {
            System.out.println("Harap menekan tombol nomor 14 untuk menuju lantai 13");
        }

        // jika lantai lebih besar dari 13 dan lantai kurang dari 18
        // print lantai yang dikurangi 1 (decrement)
        else if (floor > unavailableFloor && floor <= finalFloor) {
            floor--;
            System.out.println("Anda sedang berada di Lantai " + floor);
        }

        // jika lantai tidak memenuhi pengkondisian diatas maka print "Lantai tidak
        // tersedia"
        else {
            System.out.println("Lantai tidak tersedia");
        }
    }
}
