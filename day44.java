import java.util.Scanner;

public class PredikatNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        double nilai = input.nextDouble();

        if (nilai >= 90 && nilai <= 100) {
            System.out.println("Predikat nilai: A");
        } else if (nilai >= 80 && nilai < 90) {
            System.out.println("Predikat nilai: B");
        } else if (nilai >= 70 && nilai < 80) {
            System.out.println("Predikat nilai: C");
        } else if (nilai >= 60 && nilai < 70) {
            System.out.println("Predikat nilai: D");
        } else if (nilai >= 0 && nilai < 60) {
            System.out.println("Predikat nilai: E");
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
}
