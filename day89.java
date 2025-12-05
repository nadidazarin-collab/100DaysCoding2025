import java.util.Scanner;

public class day89 {
    public static void hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi;
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah: " + luas);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = sc.nextInt();
        hitungLuasPersegi(sisi);
      
    }
}
