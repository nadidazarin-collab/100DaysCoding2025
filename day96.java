import java.util.Scanner;
public class HitungAritmatika {
    static int tambah(int a, int b) {
        return a + b;
    }

    static int kurang(int a, int b) {
        return a - b;
    }

    static int kali(int a, int b) {
        return a * b;
    }

    static double bagi(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int x = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int y = input.nextInt();

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Penjumlahan: " + tambah(x, y));
        System.out.println("Pengurangan: " + kurang(x, y));
        System.out.println("Perkalian  : " + kali(x, y));
        System.out.println("Pembagian  : " + bagi(x, y));
    }
}
