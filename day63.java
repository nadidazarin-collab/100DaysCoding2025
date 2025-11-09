import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();
        scanner.close();

        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println("Hasil kali 1 sampai " + n + " adalah: " + hasil);
    }
}
