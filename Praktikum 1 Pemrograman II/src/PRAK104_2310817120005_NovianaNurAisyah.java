import java.util.Scanner;

public class PRAK104_2310817120005_NovianaNurAisyah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abu = input.nextLine().toUpperCase();

        System.out.print("Tangan Bagas: ");
        String bagas = input.nextLine().toUpperCase();

        String[] a = abu.split(" ");
        String[] b = bagas.split(" ");

        int poinAbu = 0;
        int poinBagas = 0;

        for (int i = 0; i < 3; i++) {
            char TanganAbu = a[i].charAt(0);
            char TanganBagas = b[i].charAt(0);

            if (
                TanganAbu == 'B' && TanganBagas == 'G' || 
                TanganAbu == 'G' && TanganBagas == 'K' || 
                TanganAbu == 'K' && TanganBagas == 'B'
            ) {
                poinAbu++;
            } else if (
                TanganBagas == 'B' && TanganAbu == 'G' || 
                TanganBagas == 'G' && TanganAbu == 'K' || 
                TanganBagas == 'K' && TanganAbu == 'B'
            ) {
                poinBagas++;
            }
        }

        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        input.close();
    }
}
