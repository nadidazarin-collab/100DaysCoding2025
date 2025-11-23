import java.util.Scanner;
public class day77 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = in.nextLine();
      
       // mengambil bagian teks sesuai indeks yang ditentukan
        System.out.println("Substring dari indeks 6: " + kalimat.substring(6));
        System.out.println("Substring dari indeks 0 sampai 6: " + kalimat.substring(0, 6));

        // mengganti karakter/string
        System.out.println("Ganti 'a' dengan 'o': " + kalimat.replace('a', 'o'));

        // menghapus spasi di awal dan akhir, contoh biar lebih jelas disini tidak menggunakan scanner 
      // jadi saya buat variabel baru
        System.out.println("Kalimat dengan trim (asli): '" + kalimat.trim() + "'");
        String kalimatSpasi = "  Nadida Zarin Mahira  ";
        System.out.println("Kalimat dengan spasi: '" + kalimatSpasi + "'");
        System.out.println("Kalimat dengan trim: '" + kalimatSpasi.trim() + "'");

    }
}
