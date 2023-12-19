/*
 * Setelah salah satu kondisi yang mengendalikan if benar, pernyataan terkait if tersebut diekseskusi
 * namun jika tidak ada satu pun kondisi yang benar, maka pernyataan else terakhirnya adalah benar dieksekusi
 */
public class IfElseIf {
    public static void main(String[] args) {
        int i = 20;

        if (i == 10)
            System.out.println("i is 10");

        else if (i == 15)
            System.out.println("i is 15");

        else if (i == 20)
            System.out.println("i is 20");

        else
            System.out.println("i is not present");
    }
}

/*
 * output yang akan dihasilkan adalah
 * i is 20
 */