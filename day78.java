import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.println("\n=== Informasi Kalimat ===");
        System.out.println("Kalimat Asli: " + kalimat);
        System.out.println("Panjang Kalimat: " + kalimat.length() + " karakter");
        System.out.println("Kalimat dalam huruf besar: " + kalimat.toUpperCase());
        System.out.println("Kalimat dalam huruf kecil: " + kalimat.toLowerCase());
        
        System.out.println("\n=== Substring ===");
        System.out.println("Substring dari indeks 0 sampai 5: " + kalimat.substring(0, 5));

        System.out.println("\n=== Replace ===");
        System.out.println("Ganti 'a' dengan 'o': " + kalimat.replace('a', 'o'));

        System.out.println("\n=== Trim ===");
        String kalimatSpasi = "  " + kalimat + "  ";
        System.out.println("Kalimat dengan spasi: '" + kalimatSpasi + "'");
        System.out.println("Kalimat dengan trim: '" + kalimatSpasi.trim() + "'");

        System.out.println("\n=== Contains ===");
        System.out.println("Apakah kalimat mengandung 'Zarin'? " + kalimat.contains("Zarin"));

    }
}
