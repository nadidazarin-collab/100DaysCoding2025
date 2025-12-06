import java.util.Scanner;

public class day90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("lebar: ");
        double lebar = scanner.nextDouble();

        double luas = hitungLuas(panjang, lebar);
        System.out.println("Luas persegi panjang: " + luas);

        scanner.close();
    }

    public static double hitungLuas(double p, double l) {
        return p * l;
    }
}
