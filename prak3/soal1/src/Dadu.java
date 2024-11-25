import java.util.LinkedList;

public class Dadu {
    int input;
    public int min = 1;
    public int max = 6;
    int jumlah;

    public void setinput(int input) {
        this.input = input;
    }

    void acakNilai() {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);l.add(2);l.add(3);l.add(4);l.add(5);l.add(6);

        for (int i = 0; i < input; i++) {
            int randomm = (int)Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + randomm);
            jumlah += randomm;
        }

        System.out.println("Jumlah nilai dadu adalah " + jumlah);
    }
}