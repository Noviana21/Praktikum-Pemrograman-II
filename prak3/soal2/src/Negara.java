import java.util.*;

public class Negara {
    private String nama, jenis, nama_pemerintahan;
    private int tanggal, bulan, tahun;

    public Negara(String nama, String jenis, String nama_pemerintahan, int tanggal, int bulan, int tahun) {
        this.nama = nama;
        this.jenis = jenis;
        this.nama_pemerintahan = nama_pemerintahan;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public int getBulan() {
        return bulan;
    }

    public void getData() {
        Scanner inputan = new Scanner(System.in);
        nama = inputan.nextLine();
        jenis = inputan.nextLine();
        nama_pemerintahan = inputan.nextLine();

        if (jenis.equalsIgnoreCase("presiden") || jenis.equalsIgnoreCase("perdana menteri")) {
            tanggal = inputan.nextInt();
            bulan = inputan.nextInt();
            tahun = inputan.nextInt();
        }
    }

    void tampil() {
        HashMap<Integer, String> month = new HashMap<>();
        month.put(1, "Januari");
        month.put(2, "Februari");
        month.put(3, "Maret");
        month.put(4, "April");
        month.put(5, "Mei");
        month.put(6, "Juni");
        month.put(7, "Juli");
        month.put(8, "Agustus");
        month.put(9, "September");
        month.put(10, "Oktober");
        month.put(11, "November");
        month.put(12, "Desember");

        if (jenis.equalsIgnoreCase("presiden") || jenis.equalsIgnoreCase("perdana menteri")) {
            System.out.println("Negara " + nama + " mempunyai " + jenis + " bernama " + nama_pemerintahan);
        }
        else if (jenis.equalsIgnoreCase("monarki")) {
            System.out.println("Negara " + nama + " mempunyai Raja bernama " + nama_pemerintahan + "\n");
        }

        if (jenis.equalsIgnoreCase("presiden") || jenis.equalsIgnoreCase("perdana menteri")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggal + " " + month.get(getBulan()) + " " + tahun + "\n");
        }
    }
}