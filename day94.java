import java.util.Scanner;

public class day94 {
    public static void cetakNama(String nama) {
        System.out.println("Nama saya: " + nama);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        cetakNama(nama);
    }
}
