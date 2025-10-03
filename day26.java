import java.util.Scanner;

public class OperatorPenugasan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        int x = scanner.nextInt();

        System.out.print("Masukkan nilai y: ");
        int y = scanner.nextInt();

        x += y;
        System.out.println("Nilai x setelah x += y: " + x);

        x -= y;
        System.out.println("Nilai x setelah x -= y: " + x);

        x *= y;
        System.out.println("Nilai x setelah x *= y: " + x);

        if (y != 0) {
            x /= y;
            System.out.println("Nilai x setelah x /= y: " + x);
        } else {
            System.out.println("Tidak dapat membagi dengan nol!");
        }
    }
}
