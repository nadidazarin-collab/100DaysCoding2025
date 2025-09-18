import java.util.Scanner;

public class Javaday11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nadida Zarin Mahira");
        String nama = scanner.nextLine();

        System.out.print("18");
        int umur = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Tunda, Belakang stadion");
        String alamat = scanner.nextLine();

        System.out.println("Halo saya, " + nama + "!");
        System.out.println("Umur saya: " + umur + " tahun");
        System.out.println("Alamat saya: " + alamat);
      
    }
}
