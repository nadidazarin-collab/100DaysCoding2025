import java.util.Scanner;

public class javaday12 {
    public static void main(String[] args) {
        Scanner biodata = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String namaLengkap = scanner.nextLine();

        System.out.print("Masukkan Umur (tahun): ");
        byte umur = scanner.nextByte();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        short tinggiBadan = scanner.nextShort();

        System.out.print("Masukkan Berat Badan (kg): ");
        int beratBadan = scanner.nextInt();

        System.out.print("Masukkan No. HP: ");
        long noHp = scanner.nextLong();

        System.out.print("Masukkan Ukuran Sepatu: ");
        float ukuranSepatu = scanner.nextFloat();

        System.out.print("Masukkan Ukuran Celana: ");
        double ukuranCelana = scanner.nextDouble();

        System.out.print("Apakah Kamu Mahasiswa? (true/false): ");
        boolean Mahasiswa = scanner.nextBoolean();

        System.out.print("Masukkan Inisial Nama: ");
        char inisialNama = scanner.next().charAt(0);

        // Menampilkan biodata
        System.out.println("\nBiodata:");
        System.out.println("Nama: " + namaLengkap);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Berat Badan: " + beratBadan + " kg");
        System.out.println("No. HP: " + noHp);
        System.out.println("Ukuran Sepatu: " + ukuranSepatu);
        System.out.println("Ukuran Celana: " + ukuranCelana);
        System.out.println("Status Mahasiswa: " + (Mahasiswa ? "Ya" : "Tidak"));
        System.out.println("Inisial Nama: " + inisialNama);

        
    }
}
