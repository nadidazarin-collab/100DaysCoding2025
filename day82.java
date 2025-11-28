import java.util.Scanner;

public class day82 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] data = new int[n];

        System.out.println("\nMasukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        System.out.println("\nIsi array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + data[i]);
        }

    }
}
