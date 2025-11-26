import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] angka = new int[5];
        int jumlah = 0;

        System.out.println("Masukkan 5 angka:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        } System.out.println("\nAngka yang Anda masukkan:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
            jumlah += angka[i];
        } System.out.println("Jumlah: " + jumlah);
    }
}
