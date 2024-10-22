public class main {
    public static void main(String[] args) {
        buah Apel = new buah("Apel", 0.4f, 7000.0f, 40.0f);
        buah Mangga = new buah("Mangga", 0.2f, 3500.0f, 15.0f);
        buah Alpukat = new buah("Alpukat", 0.25f, 10000.0f, 12.0f);

        Apel.tokobuah();
        System.out.println("");
        Mangga.tokobuah();
        System.out.println("");
        Alpukat.tokobuah();
    }
}