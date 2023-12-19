/*
 * Nested if memungkinkan menyarangkan pernyataan if didalam pernyataan if
 */
public class NestedIf {
    public static void main(String[] args) {
        int i = 10;
        if (i == 10 || i < 15) { // jika i sama dengan 10 atau i lebih kecil dari 15
            // first if statement
            if (i < 15)
                System.out.println("i is smaller than 15");

            if (i < 12)
                System.out.println("i is smaller than 12 too");
        } else {
            System.out.println("i is greater than 15");
        }

    }
}

/*
 * output yang akan dihasilkan adalah
 * i is smaller than 15
 * i is smaller than 12 too
 */