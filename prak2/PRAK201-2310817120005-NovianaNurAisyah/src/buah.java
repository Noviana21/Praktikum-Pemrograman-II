public class buah {
    public String namabuah;
    public float berat;
    public float harga;
    public float totalberat;

    buah(String nama, float br, float hr, float tb) {
        namabuah = nama;
        berat = br;
        harga = hr;
        totalberat = tb;
    }

    public void tokobuah() {
        double hargasebelumdiskon = (totalberat / berat) * harga;
        double kelipatan = totalberat >= 4 ? totalberat / 4 : 0.0;
        double totaldiskon = 0.02f * (harga * 4) * Math.floor(kelipatan);
        double hargasetelahdiskon = hargasebelumdiskon - totaldiskon;

        System.out.println("Nama buah: " + namabuah);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Harga: Rp" + harga);
        System.out.println("Jumlah beli: " + totalberat + " kg");
        System.out.println("Harga Sebelum Diskon: Rp" + String.format("%.2f", hargasebelumdiskon));
        System.out.println("Total Diskon: Rp" + String.format("%.2f", totaldiskon));
        System.out.println("Harga Setelah Diskon: Rp" + String.format("%.2f", hargasetelahdiskon));
        System.out.println();
    }
}