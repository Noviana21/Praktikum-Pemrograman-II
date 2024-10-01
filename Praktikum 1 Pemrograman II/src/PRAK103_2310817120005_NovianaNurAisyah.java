import java.util.Scanner;

public class PRAK103_2310817120005_NovianaNurAisyah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Input = ");
        int N = input.nextInt();
        int awal = input.nextInt();

        int hitung = 0;
        int pertama = awal;
        
        do {
            if (pertama % 2 != 0) {
                System.out.print(pertama);
                hitung++;
                
                if (hitung < N) {
                    System.out.print(", ");
                }
            }
            pertama++;
        } while (hitung < N);
        input.close();
    }
}
