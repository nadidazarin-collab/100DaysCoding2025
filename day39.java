import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=======RESTO DAZAI=======");
        System.out.println("---------------------------");
        System.out.println("Menu:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu (1/2/3): ");
        int pilihan = in.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng. Silakan menikmati!");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Mie Goreng. Silakan menikmati!");
        } else if (pilihan == 3) {
            System.out.println("Terima kasih telah berkunjung^^");
        } else {
            System.out.println("Pilihan tidak valid. Silakan coba lagi!");
        }
    }
}
