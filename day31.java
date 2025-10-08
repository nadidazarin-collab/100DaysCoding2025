import java.util.Scanner;

public class OperatorLogikaAnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        System.out.print("Masukkan kehadiran: ");
        int kehadiran = scanner.nextInt();

        if (nilai >= 75 && kehadiran >= 8 ) {
            System.out.println("Anda Lulus.");
        } else {
            System.out.println("Anda tidak Lulus.");
        }
    }
}
