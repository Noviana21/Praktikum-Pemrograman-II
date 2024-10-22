public class Kopi {
    String namaKopi, ukuran;
    float harga;
    String pembeli;
    float pajak;

    public String getPembeli(){
        return pembeli;
    }

    public void setPembeli(String pembeli_baru) {
        pembeli = pembeli_baru;
    }

    public float getPajak() {
        pajak = harga * 0.11f;
        return pajak;
    }

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp." + harga);
    }
}