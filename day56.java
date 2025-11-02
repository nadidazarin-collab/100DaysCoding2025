import java.util.Scanner;

public class PerulanganDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka (0 untuk keluar): ");
            angka = scanner.nextInt();
            System.out.println("Anda memasukkan: " + angka);
        } while (angka != 0);

        scanner.close();
        System.out.println("Program selesai.");
    }
}
