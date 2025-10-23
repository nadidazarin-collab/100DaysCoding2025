import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Menu =====");
        System.out.println("1. Makan");
        System.out.println("2. Minum");
        System.out.println("3. Tidur");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = input.nextInt();

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
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
