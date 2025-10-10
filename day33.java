import java.util.Scanner;

public class ContohTidakSamaDengan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

        if (usia != 17) {
            System.out.println("Usia Anda bukan 17 tahun!");
        } else {
            System.out.println("Usia Anda adalah 17 tahun!");
        }

    }
}
