import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = scanner.nextInt();

        if (nilai >= 60) {
            if (nilai >= 80) {
                System.out.println("Lulus dengan nilai baik");
            } else {
                System.out.println("Lulus");
            }
        } else {
            System.out.println("Tidak lulus");
        }

    }
}
