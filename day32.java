import java.util.Scanner;

public class ContohOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka 5 atau 10: ");
        int angka = scanner.nextInt();

        if (angka == 5 || angka == 10) {
            System.out.println("Angka yang Anda masukkan benar!");
        } else {
            System.out.println("Angka yang Anda masukkan salah.");
        }

        
    }
}
