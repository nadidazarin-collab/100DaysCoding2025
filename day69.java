import java.util.Scanner;

public class soaleval3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" ");
        String jenisPerahu = scanner.next();

        System.out.print(" ");
        int jumlahLiter = scanner.nextInt();

        System.out.print(" ");
        String waktuPembelian = scanner.next();

        int hargaDasar = 0;
        switch (jenisPerahu) {
            case "kecil":
                hargaDasar = 10000;
                break;
            case "sedang":
                hargaDasar = 12000;
                break;
            case "besar":
                hargaDasar = 15000;
                break;
            default:
                System.out.println("Jenis perahu tidak valid");
                return;
        }

        double diskon = 0;
        if (jumlahLiter > 100) {
            diskon = 0.1;
        } else if (jumlahLiter >= 50 && jumlahLiter <= 100) {
            diskon = 0.05;
        }

        double totalBiaya = jumlahLiter * hargaDasar * (1 - diskon);

        if (waktuPembelian.equals("malam")) {
            totalBiaya *= 1.05;
        }

        System.out.println("Total biaya: " + (int) totalBiaya + " rupiah");
    }
}
