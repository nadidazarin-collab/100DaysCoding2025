import java.util.Scanner;

public class dayy67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("panjang pola: ");
        int panjang = scanner.nextInt();

        for (int i = 1; i <= panjang; i++) {
            System.out.print("* ");
        }
    }
}
