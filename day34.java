import java.util.Scanner;

public class Contoh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        if (angka <= 10 && angka != 5) {
            System.out.println("Angka kurang dari atau sama dengan 10 dan bukan 5");
        } else {
            System.out.println("Angka tidak memenuhi syarat");
        }

    }
}
