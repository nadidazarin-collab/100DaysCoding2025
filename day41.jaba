import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilihan menu");
        System.out.println("1. Nasi Goreng - Rp15.000");
        System.out.println("2. Mie Goreng - Rp12.000");
        System.out.println("3. Ayam Bakar - Rp18.000");
        
        System.out.print("masukkan pilihan menu = ");
        int menu = input.nextInt();
        
        System.out.print("masukkan jumlah porsi = ");
        int porsi = input.nextInt();
        
        int harga = 0;
        String namaMenu = "";
        
        if (menu == 1) {
            harga = 15000;
            namaMenu = "Nasi Goreng";
        } else if (menu == 2) {
            harga = 12000;
            namaMenu = "Mie Goreng";
        } else if (menu == 3) {
            harga = 18000;
            namaMenu = "Ayam Bakar";
        }
        
        if (menu >= 1 && menu <= 3) {
            int totalHarga = harga * porsi;
            double diskon = 0;
            
            if (totalHarga > 50000) {
                diskon = totalHarga * 0.10;
            } else if (porsi > 2) {
                diskon = totalHarga * 0.05;
            }
            
            double totalBayar = totalHarga - diskon;
            
            System.out.println("Menu: " + namaMenu);
            System.out.println("Jumlah: " + porsi);
            System.out.println("total harga = " + totalBayar);
        } else {
            System.out.println("TIDAK VALID!");
        }
    }
}
