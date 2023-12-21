package Internet;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("nurulfikri.ac.id");
            internet.connectTo("elena.nurulfikri.ac.id");
            internet.connectTo("abc.com");
            internet.connectTo("facebook.com");
            internet.connectTo("youtube.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
