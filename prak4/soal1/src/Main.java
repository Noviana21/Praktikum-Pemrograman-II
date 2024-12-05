import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String r, n;

        System.out.print("Nama Hewan Peliharaan: ");
        n = input.nextLine();

        System.out.print("Ras: ");
        r = input.nextLine();

        HewanPeliharaan hewan = new HewanPeliharaan(r, n);
        hewan.display();
    }
}