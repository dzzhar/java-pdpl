/*
 * Pernyataan ini adalah pernyataan dengan berbagai cabang 
 */
public class SwitchCase {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            /*
             * Break adalah keluar dari block switch
             * ini akan menghentikan eksekusi banyak kode dan pengujian khusus
             * Ketika kecocokan ditemukan maka pekerjaan selesai dan saatnya istirahat
             * Sehingga tidak perlu pengujain lebih lanjut
             */
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                /*
                 * Default adalah untuk dijalankan jika tidak ada kasus yang cocok dengan code
                 */
                System.out.println("Looking forward to the weekend");
        }
    }
}
/*
 * Break banyak digunakan untuk;
 * mengakhiri urutan dalam pernyataan switch
 * keluar dari loop
 * digunakan sebagai goto yang teratur
 * 
 * Return banyak digunakan untuk;
 * untuk kembali secara terus terang dari suatu metode
 * hal ini akan menyebabkan kendali program transfer kembali ke pemanggil metode
 */
