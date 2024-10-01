import java.text.DecimalFormat;
import java.util.Scanner;

public class PRAK105_2310817120005_NovianaNurAisyah {
    public static void main(String[] args) {
        double jari_jari, tinggi, hasil;

        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.###");

        System.out.print("Masukkan jari-jari: ");
        jari_jari = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextDouble();

        hasil = 3.14 * jari_jari * jari_jari * tinggi;
        System.out.print("Volume tabung dengan jari-jari " + jari_jari + " cm");
        System.out.print("dan tinggi " + tinggi + " cm ");
        System.out.print("adalah " + df.format(hasil) + " m3");
    }
}
