import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pil = input.nextInt();
        input.nextLine();

        if (pil == 1) {
            String x, y, z;
            System.out.print("Nama hewan peliharaan: ");
            x = input.nextLine();
            System.out.print("Ras: ");
            y = input.nextLine();
            System.out.print("Warna Bulu: ");
            z = input.nextLine();

            Kucing k = new Kucing(y, x, z);
            k.displayDetailKucing();
        } else if (pil == 2) {
            String x, y, z;
            System.out.print("Nama hewan peliharaan: ");
            x = input.nextLine();
            System.out.print("Ras: ");
            y = input.nextLine();
            System.out.print("Warna Bulu: ");
            z = input.nextLine();
            System.out.print("Kemampuan: ");
            String a = input.nextLine();

            Anjing anj = new Anjing(y, x, z, a);
            anj.displayDetailAnjing();
        } else {
            System.out.println("Pilihan tidak tersedia");
        }
    }
}