class InstanceVariable {
    public String geek; // deklarasi instance variable

    public InstanceVariable() {
        this.geek = "Zharifah Dzikra"; // default constructor
    }

    // main methode
    public static void main(String[] args) {
        InstanceVariable name = new InstanceVariable(); // membuat objek baru
        System.out.println("My name is " + name.geek);
    }
}
