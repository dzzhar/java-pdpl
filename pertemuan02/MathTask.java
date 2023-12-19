public class MathTask {
    public static void main(String[] args) {

        // a = 1, b = 2, c = 3
        // mendeklarasikan variable dengan masing-masing nilai
        /*
         * variabel adalah isi yang dapat diganti, tergantung dengan kondisi dan
         * informasi dari program.
         * 
         * double sebagai datatype
         * datatype adalah tipe data yang akan diisi didalam variabel
         * 
         * a sebagai name
         * name adalah nama yang diberikan untuk variabel
         * 
         * 1 sebagai value
         * value adalah inisial value yang diisi di variabel ini
         */
        double a = 1;
        double b = 2;
        double c = 3;

        // menghitung nilai c
        // Math.toRadians digunakan untuk mengkonversi derajat menjadi radian
        double countC = Math.toRadians(c);

        // membuat rumus dengan operator
        // Math.sqrt digunakan untuk menghitung akar kuadrat

        double count = Math.sqrt(((a * a) + (b * b)) - (2 * a * b * (Math.cos(countC))));

        System.out.println("Nama = Zharifah Dzikra Purnomo");
        System.out.println("NIM = 0110222050");
        System.out.println("Hasil = " + count);
    }
}