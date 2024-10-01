import java.util.Scanner;

public class PRAK102_2310817120005_NovianaNurAisyah {
    public static void main(String[] args) {
        final Scanner x = new Scanner(System.in);

        int i = 0, hasil;

        System.out.print("Input = ");
        int y = x.nextInt();
        System.out.print("Hasil = ");

        while (i < 11) {
            if (y % 5 == 0) {
                hasil = y / 5 - 1;
                System.out.print(hasil + " ");
            } else {
                System.out.print(y + " ");
            }
            y++;
            i++;
        }
        x.close();
    }
}
