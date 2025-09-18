import java.util.Scanner;

public class Javaday11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();
       
        /*output dari codingn ini akan meminta kita memasukkan
        nama, umur & alamat sesuai data kita*/
        System.out.println("Halo saya, " + nama + "!");
        System.out.println("Umur saya: " + umur + " tahun");
        System.out.println("Alamat saya: " + alamat);


    }
}
