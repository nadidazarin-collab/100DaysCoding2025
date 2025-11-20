import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Makan");
            System.out.println("2. Minum");
            System.out.println("3. Tidur");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih makan.");
                    break;
                case 2:
                    System.out.println("Anda memilih minum.");
                    break;
                case 3:
                    System.out.println("Anda memilih tidur.");
                    break;
                case 4:
                    System.out.println("Keluar dari menu.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

       
    }
}
