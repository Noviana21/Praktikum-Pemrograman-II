import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu d = new Dadu();
        int inputan = input.nextInt();

        d.setinput(inputan);
        d.acakNilai();
    }
}