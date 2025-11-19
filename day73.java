import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlah = 0;

        while (true) {
            System.out.print("Masukkan angka: ");
            int angka = scanner.nextInt();
            if (angka < 0) break;
            jumlah += angka;
            System.out.println("Jumlah: " + jumlah);
        }
        System.out.println("Jumlah akhir: " + jumlah);
    }
}
