import java.util.Scanner;
public class day95 {
    // penjumlahan
    static void tambah(int a, int b) {
        System.out.println("Hasil Penjumlahan: " + (a + b));
    }
    // pengurangan
    static void kurang(int a, int b) {
        System.out.println("Hasil Pengurangan: " + (a - b));
    }
    // perkalian
    static void kali(int a, int b) {
        System.out.println("Hasil Perkalian: " + (a * b));
    }
    // pembagian
    static void bagi(int a, int b) {
        System.out.println("Hasil Pembagian: " + (a / b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int x = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int y = input.nextInt();

        tambah(x, y);
        kurang(x, y);
        kali(x, y);
        bagi(x, y);
    }
}
