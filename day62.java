import java.util.Scanner;

public class day62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka N: ");
        int n = scanner.nextInt();
        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            jumlah += i;
        }

        System.out.println("Jumlah angka dari 1 hingga " + n + " adalah: " + jumlah);

    }
}
