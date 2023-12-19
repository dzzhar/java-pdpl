public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // jika bilangan genap
            // lewati dan lanjutkan
            if (i % 2 == 0)
                continue;
            // jika bilangan ganjil cetak
            System.out.println(i);
        }
    }
}

/*
 * Continue memaksakan iterasi awal dari sebuah loop
 * Anda mungkin terus menjalankan loop tetapi berhenti memproses sisa kode di
 * dalamnya untuk iterasi khusus ini
 * 
 * ini adalah langkah melewati badan perulangan, hingga akhir perulangan.
 */
