import java.util.Scanner;
public class day91 {
    public static int hitungLuas(int panjang,int lebar){       
        return panjang*lebar;        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        int p = in.nextInt();
        System.out.print("Masukkan lebar: ");
        int l = in.nextInt();
        
        int luas = hitungLuas(p,l);
        System.out.println("Luas persegi panjang : " + luas);
        
    }
}
