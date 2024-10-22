// Pada baris ini terjadi error karena adanya perbedaan antara nama file dan nama public class (nama file dan public class harus sama)
// public class Pegawai {}
public class Pegawai {
    public String nama;
    // Pada baris ini terjadi error karena pada file Soal3Main, tipe datanya bukan char
    // public String asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Pada baris ini terjadi error karena variabel j tidak dideklarasikan sebagai parameter sebelumnya
    // public void setJabatan(String j) {}
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}