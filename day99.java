import java.util.Scanner;

public class BilanganPrima {
    static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        System.out.println("Bilangan prima dari 1 sampai " + n + " adalah:");
        for (int i = 1; i <= n; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
