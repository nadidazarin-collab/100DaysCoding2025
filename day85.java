import java.util.Scanner;
public class day85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();
        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        int max = angka[0];
        for (int i = 1; i < n; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }

        System.out.println("Angka maksimal: " + max);
    }
}
