public class HewanPeliharaan {
    public String nama, ras;

    public HewanPeliharaan(String r, String n) {
        this.nama = n;
        this.ras = r;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: " + nama);
        System.out.println("Dengan ras: " + ras);
    }
}