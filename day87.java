import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();
        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        System.out.print("Cari angka: ");
        int cari = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (angka[i] == cari) {
                System.out.println("Ditemukan di indeks ke-" + i);
                scanner.close();
                return;
            }
        }
        System.out.println("Angka tidak ditemukan.");
    }
}
