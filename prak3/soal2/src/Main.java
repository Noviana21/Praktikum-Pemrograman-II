import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama = "", jenis = "", nama_pemerintahan = "";
        int tanggal = 0, bulan = 0, tahun = 0;
        Scanner input = new Scanner(System.in);
        Negara negara = new Negara(nama, jenis, nama_pemerintahan, tanggal, bulan, tahun);
        LinkedList<Negara> listNegara = new LinkedList<>();

        int ulang;
        ulang = input.nextInt();

        for (int i = 0; i < ulang; i++) {
            Negara c = new Negara(nama, jenis, nama_pemerintahan, tanggal, bulan, tahun);
            c.getData();
            listNegara.add(c);
        }

        for (int i = 0; i < listNegara.size(); i++) {
            Negara nIndex = listNegara.get(i);
            nIndex.tampil();
        }
    }
}