import java.util.Scanner;

public class GajiBersih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gajiPokok = 5000000;
        double lemburPerJam = 50000;
        double pajak = 0.05;

        System.out.print("Masukkan jumlah jam lembur: ");
        int jamLembur = input.nextInt();

        double totalLembur = lemburPerJam * jamLembur;
        double totalGaji = gajiPokok + totalLembur;
        double gajiBersih = totalGaji - (totalGaji * pajak);

        System.out.println("Gaji Bersih: Rp " + gajiBersih);
    }
}
